package ex09;

class GradeExpr {
    private int[] jumsu;

    // 생성자: 전달받은 jumsu 배열을 멤버 변수에 할당
    public GradeExpr(int[] jumsu) {
        this.jumsu = jumsu;
    }

    // 총점 계산
    public int getTotal() {
        int total = 0;
        for (int score : jumsu) {
            total += score;
        }
        return total;
    }

    // 평균 계산
    public double getAverage() {
        return (double) getTotal() / jumsu.length;
    }

    // 최고 점수 찾기
    public int getGoodScore() {
        int max = jumsu[0];
        for (int score : jumsu) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    // 최저 점수 찾기
    public int getBadScore() {
        int min = jumsu[0];
        for (int score : jumsu) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }
}

//package ex02;
//
//public class GradeExpr {
//	int[] jumsu;
//	
//	GradeExpr(int[] jumsu){
//		this.jumsu = jumsu;
//	}
//	
//	int sum = 0;
//
//	int getTotal() {
//		for(int i=0; i<jumsu.length; i++)
//			sum += jumsu[i];
//	}
//	
//	double getAverage() {
//		(double)sum / jumsu.length;
//	}
//	
//	
//	
//	int getGoodScore() {
//		int max = jumsu[0]; //배열의  첫번째 값을 0으로 초기화 한다.
//		for(int i = 0; i < jumsu.length; i++) {
//			if(jumsu[i] > max) {
//				max = jumsu[i];
//			}
//		}
//	}
//	
//	int getBadScore() {}
//		int min = jumsu[0]; //배열의  첫번째 값을 0으로 초기화 한다.
//		for(int i = 0; i < jumsu.length; i++) {
//			if(jumsu[i] < min) {
//				min = jumsu[i];
//			}
//		}
//}

