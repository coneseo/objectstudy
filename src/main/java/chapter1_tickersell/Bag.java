package chapter1_tickersell;

public class Bag {
  private Long amount;
  private Invitation invitation;
  private Ticket ticket;

  public boolean hasInvitation(){
    return invitation != null;
  }

  public boolean hasTicket(){
    return invitation != null;
  }

  public void setTicket(Ticket ticket){
    this.ticket = ticket;
  }

  public void minusAmount(Long amount){
    this.amount -= amount;
  }

  public void plusAmount(Long amount){
    this.amount += amount;
  }
}
