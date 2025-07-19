package covy.lotto.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LottoServiceTest {

  @Autowired
  private LottoService service;

  @Test
  void lottoservice() {
    service.lottoservice(10);
  }
}