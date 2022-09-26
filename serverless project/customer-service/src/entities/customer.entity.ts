import {Column, Entity, PrimaryGeneratedColumn} from 'typeorm'

@Entity('customer')
export class Customer{

    @PrimaryGeneratedColumn('uuid')
    id: String;
    @Column({type: String})
    name: String;
    @Column({type: String})
    mobile: String;
    @Column({type: String})
    city: String;

}