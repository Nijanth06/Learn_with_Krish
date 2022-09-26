import { successResponse } from "@libs/response";
import { Customer } from "src/entities/customer.entity";
import { fetch } from "./customer-service";

const fetchCustomer = async(event) => {

    const customer:Customer= await fetch(event.path.customerId);
    return successResponse(customer);
}
export const main = fetchCustomer;