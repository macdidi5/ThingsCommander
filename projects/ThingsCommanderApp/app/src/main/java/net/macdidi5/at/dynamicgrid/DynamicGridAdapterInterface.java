package net.macdidi5.at.dynamicgrid;

public interface DynamicGridAdapterInterface {

    void reorderItems(int originalPosition, int newPosition);

    int getColumnCount();

    boolean canReorder(int position);

}
