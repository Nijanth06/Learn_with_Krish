package builderPattern;

public class Employee {
	
	private final String name;
	private final int age;
	private final String address;
	private final String phone;
	


public Employee(Builder builder) {
	this.name= builder.name;
	this.age= builder.age;
	this.address= builder.address;
	this.phone= builder.phone;
	
	
}
	
	static class Builder{
		private String name;
		private int age;
		private String address;
		private String phone;
		
		public Employee build() {
			return new Employee ( this);
		}
		
		public Builder(String name) {
			this.name= name;
			
		}
		
		public Builder phone(String phone) {
			this.phone= phone;
			return this;
		}
		
		public Builder age(int age) {
			this.age= age;
			return this;
		}
		
		public Builder address(String address) {
			this.address= address;
			return this;
		}

		@Override
		public String toString() {
			return "Builder [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + "]";
		}
		
		
	}

}
