package model;

public class Skill {
	private int SkillId;
	private String SkillName;
	private String SkillDescription;
	private String active;
	//default constructor method
		public Skill() {
			super();
			// TODO Auto-generated constructor stub
		}
		//parameterized constructor method will all fields
		public Skill(int skillId, String skillName, String SkillDescription, String active) {
			super();
			this.SkillId = SkillId;
			this.SkillName = SkillName;
			this.SkillDescription =SkillDescription;
			this.active =active ;

		}
		//parameterized constructor method without skillId and active fields
		public Skill(String SkillName, String lastName, String SkillDescription, String active) {
			super();
			this.SkillName = SkillName;
			this.SkillDescription = SkillDescription;
			this.active = active;
		}
		//getter and setter methods
		public int getSkillId() {
			return SkillId;
		}
		public void setEmployeeId(int SkillId) {
			this.SkillId = SkillId;
		}
		public String getSkillName() {
			return SkillName;
		}
		public void setSkillName(String SkillName) {
			this.SkillName = SkillName;
		}
		public String getSkillDescription() {
			return SkillDescription;
		}
		public void setLastName(String SkillDescription) {
			this.SkillDescription = SkillDescription;
		}
		public String getactive() {
			return active;
		}
		public void setactive(String active) {
			this.active = active;
		}
		
		@Override
		public String toString() {
			return "Skill [SkillId=" + SkillId + ", skillName=" +  SkillName + ", SkillDescription=" + SkillDescription + ", active="
					+ active + ",]";
		}
		
		
	}

