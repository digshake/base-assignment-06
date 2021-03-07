
package assignment6.maxpath.gui;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
class CellView extends AbstractCellComponent {
	private static final long serialVersionUID = 1L;

	private boolean isStone;

	public CellView(int row, int column, boolean isStone) {
		super(row, column);
		this.isStone = isStone;
		setSelected(!isStone);
	}

	@Override
	public boolean contains(int x, int y) {
		return false;
	}

	@Override
	public boolean isStone() {
		return isStone;
	}

	@Override
	protected void updateText(String text) {
		setText(text);
	}
}
