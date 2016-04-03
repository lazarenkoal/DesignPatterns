package BehavioralPatterns.Iterator;

/**
 * Created by aleksandrlazarenko on 03.04.16.
 */
public interface ChannelCollection {
    public void addChannel(Channel c);
    public void removeChannel(Channel c);
    public ChannelIterator iterator(ChannelTypeEnum type);
}
