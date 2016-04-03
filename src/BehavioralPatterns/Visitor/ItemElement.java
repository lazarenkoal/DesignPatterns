package BehavioralPatterns.Visitor;

/**
 * Created by aleksandrlazarenko on 03.04.16.
 */
public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
