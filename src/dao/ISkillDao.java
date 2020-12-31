package dao;

import java.util.List;
import model.Skill;

public interface ISkillDao {
	List<Skill> getAllSkill();
	void addSkill(Skill s);
	Skill getSkillById(int id);
	void updateSkill(Skill s);
	void deleteSkill(int id);

}
