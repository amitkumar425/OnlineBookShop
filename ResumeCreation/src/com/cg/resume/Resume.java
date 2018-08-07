//This class has the instance members related to a resume.
//The Object of this file is created by the controller.

package com.cg.resume;

import java.util.Arrays;

public class Resume {
	private String fname, lname, gender, qualification, dob, photo, address, email, website, contactNumber, summary,
			reset, submit;
	private String[] hobbies, skills;

	public Resume(String fname, String lname, String gender, String qualification, String dob, String photo,
			String address, String email, String website, String contactNumber, String summary, String reset,
			String submit, String[] hobbies, String[] skills) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.qualification = qualification;
		this.dob = dob;
		this.photo = photo;
		this.address = address;
		this.email = email;
		this.website = website;
		this.contactNumber = contactNumber;
		this.summary = summary;
		this.reset = reset;
		this.submit = submit;
		this.hobbies = hobbies;
		this.skills = skills;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getGender() {
		return gender;
	}

	public String getQualification() {
		return qualification;
	}

	public String getDob() {
		return dob;
	}

	public String getPhoto() {
		return photo;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getWebsite() {
		return website;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getSummary() {
		return summary;
	}

	public String getReset() {
		return reset;
	}

	public String getSubmit() {
		return submit;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public String[] getSkills() {
		return skills;
	}

	@Override
	public String toString() {
		return "Resume [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", qualification=" + qualification
				+ ", dob=" + dob + ", photo=" + photo + ", address=" + address + ", email=" + email + ", website="
				+ website + ", contactNumber=" + contactNumber + ", summary=" + summary + ", reset=" + reset
				+ ", submit=" + submit + ", hobbies=" + Arrays.toString(hobbies) + ", skills=" + Arrays.toString(skills)
				+ "]";
	}

}
