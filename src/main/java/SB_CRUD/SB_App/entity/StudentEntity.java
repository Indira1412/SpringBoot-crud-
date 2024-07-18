package SB_CRUD.SB_App.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDetails")

public class StudentEntity {
	@Override
	public String toString() {
		return "StudentEntity [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", branch="
				+ branch + "]";
	}
	
	StudentEntity(){
		
	}
	public StudentEntity(String name, float percentage, String branch) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.branch = branch;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int rollNo;
	
	@Column(name="Student_name")
	private String name;
	
	@Column(name="Student_percantage")
	private float percentage;
	
	@Column(name="Student_branch")
	private String branch;

}
