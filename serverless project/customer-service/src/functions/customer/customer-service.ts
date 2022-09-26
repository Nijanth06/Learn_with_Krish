import { getDatabaseConnection } from "@libs/database-manager";
import { Customer } from "src/entities/customer.entity";

const create = async(customer: Customer): Promise<Customer>=> {
    const customerRepository = await(await getDatabaseConnection()).getRepository(Customer);
        const newCustomer: Customer = await customerRepository.save(customer).catch((e) => {
            console.error('failed to create employee record', e);
            throw new Error(e);
            
        });
        return newCustomer;
};

const fetch = async(customerId: String): Promise<Customer>=> {
    const customerRepository = await(await getDatabaseConnection()).getRepository(Customer);
        const newCustomer: Customer = await customerRepository.findOneBy({id:customerId}).catch((e) => {
            console.error('failed to fetch customers record', e);
            throw new Error(e);
            
        });
        return newCustomer;
};

const fetchAll = async(): Promise<Customer[]>=> {
    const customerRepository = await(await getDatabaseConnection()).getRepository(Customer);
        const customers: Customer[] = await customerRepository.find().catch((e) => {
            console.error('failed to fetchAll customers', e);
            throw new Error(e);
            
        });
        return customers;
};
export {create, fetch, fetchAll};