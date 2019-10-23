package chapter1.convenienceshop;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bag {
  private Map<Product, Integer> products;
  private Wallet wallet;
}
