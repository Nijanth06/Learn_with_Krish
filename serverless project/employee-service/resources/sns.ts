export default{
    EmployeeCreate: {
        Type: 'AWS::SNS::Topic',
        Properties: {
            TopicName: 'codelabs-employee-create-topic-${sls:stage}',
        },
    },
};