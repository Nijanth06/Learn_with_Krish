import { handlerPath } from "@libs/handler-resolver";
import schema from "./schema";

const create= {
  handler: `${handlerPath(__dirname)}/create.main`,
  events: [
    {
      http: {
        method: 'post',
        path: 'customers',
        request: {
          schemas: {
            'application/json': schema,
          },
        },
        private: true,
      },
    },
  ],
};

const fetch= {
  handler: `${handlerPath(__dirname)}/fetch.main`,
  events: [
    {
      http: {
        method: 'get',
        path: 'customers/{customid}',
      
      },
    },
  ],
};

const fetchAll= {
  handler: `${handlerPath(__dirname)}/fetchAll.main`,
  events: [
    {
      http: {
        method: 'get',
        path: 'customers',
      
      },
    },
  ],
};
export {create, fetch, fetchAll};