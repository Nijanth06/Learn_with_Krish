import { successResponse } from "@libs/response";
import { Employee } from "src/entitis/employee.entity";
import { fetch, fetchAll } from "./employee-service"


const fetchAllEmployee = async(event) => {

    const employees:Employee[]= await fetchAll();
    return successResponse(employees);
}
export const main = fetchAllEmployee;