
import { Console } from "console";
import { Customer } from "src/entities/customer.entity";

import { DataSource, EntityManager } from "typeorm";


let datasource: DataSource

const getDatabaseConnection=async(): Promise<EntityManager> => {
    if(datasource && datasource.isInitialized) {
        console.log('connection already available. reusing exsisting connection');
        return datasource.manager;
    }else{
        console.log('connection not available. create new one');
        datasource = new DataSource({
            applicationName: 'customer-service',
            type: 'postgres',
            host: process.env.DBHOSTNAME,
            port: +process.env.DBPORT,
            database: process.env.DBNAME,
            username: process.env.DBUSERNAME,
            password: process.env.DBPASSWORD,
            schema: process.env.DBSCHEMA,
            connectTimeoutMS: 30000,
            synchronize: true,
            logging: false,
            useUTC: true,
            entities: [Customer],
        });
        return await datasource
        .initialize()
        .then(() => {
            console.trace('new database connection made');
            return datasource.manager;
        })
        .catch((e) => {
            console.debug(e,'error on connecting to database');
            throw new Error(e);
        })
    }
};
export {getDatabaseConnection};