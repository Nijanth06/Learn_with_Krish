export default {
  type: "object",
  properties: {
    name: { type: 'string' },
    mobile: { type: 'string' },
    city: { type: 'string' }
  },
  required: ['name','mobile', 'city']
} as const;
