package assignment6.maxpath.gui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
abstract class ChartPane extends JPanel {
	private static final long serialVersionUID = 1L;

	protected final CellView[][] chart;

	public ChartPane(boolean[][] stones, int row0, int column0) {
		chart = new CellView[stones.length][stones[0].length];

		int gap = 6;
		setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
		setLayout(new GridLayout(chart.length, chart[0].length, gap, gap));
		for (int r = 0; r < chart.length; ++r) {
			for (int c = 0; c < chart[r].length; ++c) {
				chart[r][c] = new CellView(r, c, stones[r][c]);
				add(chart[r][c]);
			}
		}

		for (int r = 0; r < chart.length; ++r) {
			for (int c = 0; c < chart[r].length; ++c) {
				chart[r][c].updateCell0(row0, column0);
			}
		}
	}

	@Override
	public Dimension getMaximumSize() {
		return getPreferredSize();
	}
}
