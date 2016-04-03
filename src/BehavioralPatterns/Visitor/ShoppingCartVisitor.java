package BehavioralPatterns.Visitor;

/**
 * Created by aleksandrlazarenko on 03.04.16.
 */
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
