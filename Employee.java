package com.hcl.employee.model;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
	
	@Column( nullable = false, unique = true)
	//@idNumber(message = "Please provide a valid e-mail")
	@NotEmpty(message = "Please provide an e-mail")  
	 private String idNumber;
	@NotNull(message = "Name may not be empty")  
	  private String fristName;
	    private String lastName;
	    private long mobileNumber;
	    
	    private String physicalAddress;
	    
	    public Employee() {

	    }
	    

		public Employee(String idNumber, String fristName, String lastName, long mobileNumber, String physicalAddress) {
			super();
			this.idNumber = idNumber;
			this.fristName = fristName;
			this.lastName = lastName;
			this.mobileNumber = mobileNumber;
			this.physicalAddress = physicalAddress;
		}

        
		

		public String getIdNumber() {
			return idNumber;
		}


		public void setIdNumber(String idNumber) {
			this.idNumber = idNumber;
		}


		public String getFristName() {
			return fristName;
		}


		public void setFristName(String fristName) {
			this.fristName = fristName;
		}


		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public long getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public String getPhysicalAddress() {
			return physicalAddress;
		}

		public void setPhysicalAddress(String physicalAddress) {
			this.physicalAddress = physicalAddress;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((fristName == null) ? 0 : fristName.hashCode());
			result = prime * result + ((idNumber == null) ? 0 : idNumber.hashCode());
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			result = prime * result + (int) (mobileNumber ^ (mobileNumber >>> 32));
			result = prime * result + ((physicalAddress == null) ? 0 : physicalAddress.hashCode());
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
			if (fristName == null) {
				if (other.fristName != null)
					return false;
			} else if (!fristName.equals(other.fristName))
				return false;
			if (idNumber != other.idNumber)
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			if (mobileNumber != other.mobileNumber)
				return false;
			if (physicalAddress == null) {
				if (other.physicalAddress != null)
					return false;
			} else if (!physicalAddress.equals(other.physicalAddress))
				return false;
			return true;
		}
	    
	    
	}

