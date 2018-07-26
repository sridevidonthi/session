package net.serenitybdd.practiseSession.steps;



public class Employee {

	
	private String id;
	

	private String employee_name;
	
	private String employee_salary;
	private String employee_age;
	
	private String profile_image;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(String employee_salary) {
		this.employee_salary = employee_salary;
	}

	public String getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(String employee_age) {
		this.employee_age = employee_age;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employee_age == null) ? 0 : employee_age.hashCode());
		result = prime * result + ((employee_name == null) ? 0 : employee_name.hashCode());
		result = prime * result + ((employee_salary == null) ? 0 : employee_salary.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((profile_image == null) ? 0 : profile_image.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employee_age == null) {
			if (other.employee_age != null)
				return false;
		} else if (!employee_age.equals(other.employee_age))
			return false;
		if (employee_name == null) {
			if (other.employee_name != null)
				return false;
		} else if (!employee_name.equals(other.employee_name))
			return false;
		if (employee_salary == null) {
			if (other.employee_salary != null)
				return false;
		} else if (!employee_salary.equals(other.employee_salary))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (profile_image == null) {
			if (other.profile_image != null)
				return false;
		} else if (!profile_image.equals(other.profile_image))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employee_name=" + employee_name + ", employee_salary=" + employee_salary
				+ ", employee_age=" + employee_age + ", profile_image=" + profile_image + "]";
	}
	
}
