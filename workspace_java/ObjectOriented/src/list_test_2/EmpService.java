package list_test_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {

    private List<Emp> empList; //멤버변수인 리스트 생성
    private Scanner sc;

    public EmpService() {
        sc = new Scanner(System.in);
        empList = new ArrayList<>(); //empList는 사원이 여러명 저장되는 통이 된다.

        Emp e1 = new Emp(1001, "kim", "개발부", "1111-1111", 200);
        Emp e2 = new Emp(1002, "lee", "개발부", "1111-1112", 200);
        Emp e3 = new Emp(1003, "choi", "영업부", "1111-1113", 200);
        Emp e4 = new Emp(1004, "park", "영업부", "1111-1114", 200);
        Emp e5 = new Emp(1005, "jung", "인사부", "1111-1115", 200);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

    }
    //1번 아이디 비번 입력으로 로그인
    public void login(){
        boolean isRunning = true; //while문 반복 변수
        boolean isFind = false; //일치 여부 불일치 확인

        while(isRunning){
            System.out.print("사번 : ");
            int empNo = sc.nextInt();
            System.out.print("비밀번호(연락처 마지막 4자리 : ");
            String pw = sc.next();

            //입력한 사번과 비밀번호 일치 여부 확인
            for(Emp e : empList){
                if(e.getEmpNo() == empNo && e.getPw().equals(pw)){
                    isRunning = false;
                    System.out.println("로그인 하였습니다.");
                    System.out.println("'" + e.getName() + "'님 반갑습니다.");
                    isFind = true;
                }
            }
            if (!isFind){
                System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
            }
        }
    }

    //2번 부서 입력 받고 그 부서의 월급 출력
    public void printDeptMoney(){
        System.out.println("부서명 : ");
        String dept = sc.next();


        int sum = 0;
        int cnt = 0;
        System.out.println("=="+ dept +"월급 현황==");

        for (int i = 0; i < empList.size(); i++){
            if (empList.get(i).getDept().equals(dept)){
                System.out.println(empList.get(i));
                sum = sum + empList.get(i).getMoney();
                cnt++;
            }
        }
        System.out.println(dept + "의 월급 총액은 " + sum + ", 평균 급여는 " + (sum / (double)cnt));
    }

    //3번 입력 받은 부서 모든 사원 월급 인상
    public void increaseMoney(){
        System.out.println("부서명 : ");
        String dept = sc.next();
        System.out.println("인상급여 : ");
        int money = sc.nextInt();
        System.out.println(dept + " 각 사원의 급여가 각각" + money + "원씩 인상됩니다.");

        //급여 인상 코드
        for (Emp e : empList){
            if (e.getDept().equals(dept)){
                e.setMoney(e.getMoney()+money);
            }
        }

        //인상된 사원 정보 출력
        for(Emp e : empList){
            if(e.getDept().equals(dept)){
                System.out.println(e);
            }
        }

    }

}
