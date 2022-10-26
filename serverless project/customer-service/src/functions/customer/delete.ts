import { successResponse } from "@libs/response";
import { Customer } from "src/entities/customer.entity";


const deleteCustomer = async(event) => {

    const custom:Customer= await delete(event.path.customerId);
    return successResponse(custom);
}
export const main = deleteCustomer;