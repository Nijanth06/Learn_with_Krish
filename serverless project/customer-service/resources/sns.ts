export default{
    CustomerCreate: {
        Type: 'AWS::SNS::Topic',
        Properties: {
            TopicName: 'codelabs-customer-create-topic-${sls:stage}',
        },
    },
};