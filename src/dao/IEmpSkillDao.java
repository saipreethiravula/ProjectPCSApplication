package dao;

import java.util.List;
import model.EmpSkill;

public interface IEmpSkillDao {
	List<EmpSkill> getAllEmpSkill();
	void addEmpSkill(EmpSkill empskill);
	EmpSkill getEmpSkillById(int id);
	void updateEmpSkill(EmpSkill empskill);
	void deleteEmpSkill(int id);

}
