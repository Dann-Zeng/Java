package team.service;

import team.domain.Architect;
import team.domain.Designer;
import team.domain.Employee;
import team.domain.Programmer;

public class TeamService {
    private static int counter = 1;

    private final int MAX_MEMBER = 5;

    private Programmer [] team = new Programmer[MAX_MEMBER];

    private int total;

    public Programmer [] getTeam(){
        Programmer [] team = new Programmer[total];
        for (int i = 0; i < total; i++){
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException{
        // 成员已满, 无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满, 无法添加");
        }
        // 该成员不是开发人员, 无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员, 无法添加");
        }
        Programmer p = (Programmer) e;
        Status status = p.getStatus();

        switch (status){
            case BUSY:
                throw new TeamException("该成员已是其他团队员工");
            case VOCATION:
                throw new TeamException("该员工正在休假");
        }

        // 该员工已经在开发团队中
        boolean isExit = isExit(p);
        if (isExit){
            throw new TeamException("该员工已经在开发团队中");
        }

        int proNum, desNmb, arcNum;
        proNum =  desNmb =  arcNum = 0;
        for (int i = 0; i < total; i++){
            if (team[i] instanceof Architect){
                arcNum++;
            }else if(team[i] instanceof Designer){
                desNmb++;
            }else {
                proNum++;
            }
        }

        if(p instanceof Architect){
            if (arcNum >= 1){
                throw new TeamException("一个团队中最多一名架构师");
            }
        }else if (p instanceof Designer){
            if (desNmb >= 2){
                throw new TeamException("一个团队中最多两名设计师");
            }
        }else {
            if (proNum >= 3){
                throw new TeamException("一个团队中最多三名程序员");
            }
        }

        // p如果可以执行到这里, 证明p可以添加到team数组中
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
    }

    public void removeMember(int merberID) throws TeamException{
        int i = 0;
        for (; i < total; i++){
            if (team[i].getMemberId() == merberID){
                // 找到了
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        // 没找到
        if (i == total){
            throw new TeamException("没找到merberID指定员工删除失败");
        }

        // 调整数值
        for (int j = i; j < total -1; j++){
            team[i] = team[i + 1];
        }
        team[--total] = null;

    }

    private boolean isExit(Programmer p){
        for (int i = 0; i < total; i++){
            if (p.getId() == team[i].getId()){
                return true;
            }
        }
        return false;
    }
}
