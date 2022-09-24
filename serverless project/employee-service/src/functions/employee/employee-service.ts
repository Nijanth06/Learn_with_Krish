import { getDatabaseConnection } from "@libs/database-manager";
import { Employee } from "src/entitis/employee.entity";


const create = async(employee: Employee): Promise<Employee>=> {
    const employeeRepository = await(await getDatabaseConnection()).getRepository(Employee);
        const newEmployee: Employee = await employeeRepository.save(employee).catch((e) => {
            console.error('failed to create employee record', e);
            throw new Error(e);
            
        });
        return newEmployee;
};

const fetch = async(employeeId: String): Promise<Employee>=> {
    const employeeRepository = await(await getDatabaseConnection()).getRepository(Employee);
        const newEmployee: Employee = await employeeRepository.findOneBy({id:true}).catch((e) => {
            console.error('failed to fetch employee record', e);
            throw new Error(e);
            
        });
        return newEmployee;
};

const fetchAll = async(): Promise<Employee[]>=> {
    const employeeRepository = await(await getDatabaseConnection()).getRepository(Employee);
        const employees: Employee[] = await employeeRepository.find().catch((e) => {
            console.error('failed to fetchAll employees', e);
            throw new Error(e);
            
        });
        return employees;
};
export {create, fetch, fetchAll};