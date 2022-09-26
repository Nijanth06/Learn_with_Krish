import { ValidatedEventAPIGatewayProxyEvent } from "@libs/api-gateway";
import { middyfy } from "@libs/lambda";
import { successResponse } from "@libs/response";
import { Customer } from "src/entities/customer.entity";
import { create } from "./customer-service";
import schema from "./schema";

const createCustomer: ValidatedEventAPIGatewayProxyEvent<typeof schema> = async (event) => {
    const customer: Customer = event.body as any as Customer;
    const custom = await create(customer);
  return successResponse({customer});
};

export const main = middyfy(createCustomer);