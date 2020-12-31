package excDao;

import java.util.Iterator;
import java.util.List;

import controller.SkillController;

import java.io.*;


import model.Employee;
import model.Skill;

public class SkillExec {
   SkillController skillController=null;
	
	public SkillExec() {
		skillController=new SkillController();
	}
	
	public void getAllSkill() {
		List<Skill> skillList=skillController.getAllSkill();
		for(Skill s:skillList) {
			System.out.println(s);
		}
	}
	
	public void getSkillById() {
		int id=0;
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter skill id whose record you want to view:");
			id=Integer.parseInt(reader.readLine());
		}
		catch(IOException ex){
			System.out.println(ex);
		}
		Skill s=SkillController.getSkillById(id);
		System.out.println(s);
	}
	
	public void addSkill() {
		Skill s=new Skill();
	
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Skill Details:");
		    System.out.println("Skill Name:");
			String skillName=reader.readLine();
			s.setSkillName(skillName);
			System.out.println("Skill Description:");
			s.setSkillDescription=reader.readLine();
			s.setSkillName(skillName);
			
			if(skillName.equals("Coding"));
			{
			 s.setActive("active");
			}
			
			 s.setActive("Deactive");
		}
			
		}catch(IOException ex){
			System.out.println(ex);
		}
		skillController.addSkill(s);
}
}
	
	public void updateSkill) {
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			String SkillName, SkillId, SkillDescription;
			System.out.println("Enter SkillId whose record you want to update:");
			id=Integer.parseInt(reader.readLine());
			Skill s=SkillController.getSkillById(id);
			System.out.println("Enter your SkillId:");
			SkillId=reader.readLine();
			System.out.println("Enter your SkillName:");
			SkillName=reader.readLine();
			System.out.println("Enter your SkillDescription:");
			SkillDescription=reader.readLine();
			if(skillId.equals(confirmSkillId)) {
				s.setskillId(SkillId);
				s.setSkillName(SkillName);
				skillController.updateSkill(s);
			}
			else {
				System.out.println("Sorry! you have entered different SkillId!");
			}
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void deleteSkill() {
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter Skilld whose record you want to delete:");
			id=Integer.parseInt(reader.readLine());
			skillController.deleteSkill(id);
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
}



