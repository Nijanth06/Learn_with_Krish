import { successResponse } from "@libs/response";
import { Customer } from "src/entities/customer.entity";
import { fetchAll } from "./customer-service";

const fetchAllCustomer = async(event) => {

    const customer:Customer[]= await fetchAll();
    return successResponse(customer);
}
export const main = fetchAllCustomer;