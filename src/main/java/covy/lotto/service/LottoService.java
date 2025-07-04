package covy.lotto.service;


import java.util.Arrays;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class LottoService {

  public void lottoservice(int num) {
    for (int k = 0; k < num; k++) {
      int[] lotto = new int[6];
      Random random = new Random();

      // 랜덤번호 생성
      for (int i = 0; i < lotto.length; i++) {
        lotto[i] = random.nextInt(45) + 1;
        // 중복번호 제거!
        for(int j = 0; j < i; j++) {
          if(lotto[i] == lotto[j]) {
            i--;
            break;
          }
        }
      }

      // 오름차순 정렬
      for(int i = 0; i < lotto.length; i++) {
        for(int j = i + 1; j < lotto.length; j++) {
          if(lotto[i] > lotto[j]) {
            int temp = lotto[i];
            lotto[i] = lotto[j];
            lotto[j] = temp;
          }
        }
      }

      // 랜덤번호 출력
      System.out.println("* 로또번호 : " + Arrays.toString(lotto));
    }
  }

}
