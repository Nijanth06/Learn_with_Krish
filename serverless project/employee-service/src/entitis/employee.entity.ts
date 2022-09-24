import {Column, Entity, PrimaryGeneratedColumn} from 'typeorm'

@Entity('employee')
export class Employee {
    @PrimaryGeneratedColumn('uuid')
    id: String;
    @Column({type: String})
    firstName:String;
    @Column({type: String})
    lastName: String;
    @Column({type: String})
    city: String;
}