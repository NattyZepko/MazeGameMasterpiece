import java.awt.Polygon;
import java.awt.geom.Point2D;

public class LevelsBuilder {
	public static BSPNode Level1Finish = null, Level2Finish = null;
	
	
	public static BSPNode buildBSPTestLevel() {
		// LEAF NODES
		BSPNode area1 = new BSPNode(new Polygon(new int[] { 324, 635, 635, 324 }, new int[] { 180, 180, 0, 0 }, 4),
				true);
		BSPNode area2 = new BSPNode(new Polygon(new int[] { 400, 400, 635, 635 }, new int[] { 180, 470, 470, 180 }, 4),
				true);
		BSPNode area3 = new BSPNode(new Polygon(new int[] { 400, 400, 272, 272 }, new int[] { 290, 470, 470, 290 }, 4),
				true);
		BSPNode area4 = new BSPNode(new Polygon(new int[] { 400, 272, 272, 400 }, new int[] { 290, 290, 260, 260 }, 4),
				false);
		BSPNode area5 = new BSPNode(new Polygon(new int[] { 272, 400, 400, 272 }, new int[] { 180, 180, 260, 260 }, 4),
				true);
		BSPNode area6 = new BSPNode(new Polygon(new int[] { 272, 324, 324, 272 }, new int[] { 150, 150, 0, 0 }, 4),
				true);
		BSPNode area7 = new BSPNode(new Polygon(new int[] { 272, 197, 197, 272 }, new int[] { 180, 180, 470, 470 }, 4),
				true);
		BSPNode area8 = new BSPNode(new Polygon(new int[] { 272, 324, 324, 272 }, new int[] { 180, 180, 150, 150 }, 4),
				false);
		BSPNode area9 = new BSPNode(new Polygon(new int[] { 197, 197, 0, 0 }, new int[] { 150, 470, 470, 150 }, 4),
				true);
		BSPNode area10 = new BSPNode(new Polygon(new int[] { 272, 0, 0, 272 }, new int[] { 150, 150, 0, 0 }, 4), true);
		BSPNode area11 = new BSPNode(new Polygon(new int[] { 272, 197, 197, 272 }, new int[] { 180, 180, 150, 150 }, 4),
				false);

		// LINE NODES
		BSPNode g = new BSPNode(new Line(new Point2D.Float(272, 0), new Point2D.Float(272, 470)), area6, area8);
		BSPNode f = new BSPNode(new Line(new Point2D.Float(324, 180), new Point2D.Float(324, 0)), g, area1);
		BSPNode d = new BSPNode(new Line(new Point2D.Float(470, 290), new Point2D.Float(272, 290)), area3, area4);
		BSPNode e = new BSPNode(new Line(new Point2D.Float(272, 260), new Point2D.Float(400, 260)), area5, d);
		BSPNode c = new BSPNode(new Line(new Point2D.Float(400, 180), new Point2D.Float(400, 470)), area2, e);
		BSPNode b = new BSPNode(new Line(new Point2D.Float(272, 180), new Point2D.Float(635, 180)), f, c);
		BSPNode j = new BSPNode(new Line(new Point2D.Float(272, 180), new Point2D.Float(197, 180)), area7, area11);
		BSPNode k = new BSPNode(new Line(new Point2D.Float(197, 150), new Point2D.Float(197, 470)), j, area9);
		BSPNode h = new BSPNode(new Line(new Point2D.Float(272, 150), new Point2D.Float(0, 150)), k, area10);
		BSPNode a = new BSPNode(new Line(new Point2D.Float(272, 0), new Point2D.Float(272, 470)), b, h);

		// return the root
		return a;
	}

	public static BSPNode buildBSPLevel1() {
		// LEAF NODES
		BSPNode area1 = new BSPNode(new Polygon(new int[] { 32, 114, 114, 32 }, new int[] { 114, 114, 532, 532 }, 4),
				true);
		BSPNode area2 = new BSPNode(new Polygon(new int[] { 114, 142, 142, 114 }, new int[] { 114, 114, 532, 532 }, 4),
				false);
		BSPNode area3 = new BSPNode(new Polygon(new int[] { 32, 250, 250, 32 }, new int[] { 80, 80, 114, 114 }, 4),
				true);
		BSPNode area4 = new BSPNode(new Polygon(new int[] { 142, 250, 250, 142 }, new int[] { 114, 114, 320, 320 }, 4),
				true);
		BSPNode area5 = new BSPNode(new Polygon(new int[] { 142, 390, 390, 142 }, new int[] { 320, 320, 345, 345 }, 4),
				true);
		BSPNode area6 = new BSPNode(new Polygon(new int[] { 142, 250, 250, 142 }, new int[] { 345, 345, 490, 490 }, 4),
				true);
		BSPNode area7 = new BSPNode(new Polygon(new int[] { 142, 390, 390, 142 }, new int[] { 490, 490, 532, 532 }, 4),
				true);
		BSPNode area8 = new BSPNode(new Polygon(new int[] { 250, 288, 288, 250 }, new int[] { 80, 80, 114, 114 }, 4),
				false);
		BSPNode area9 = new BSPNode(new Polygon(new int[] { 250, 288, 288, 250 }, new int[] { 114, 114, 320, 320 }, 4),
				false);
		BSPNode area9B = new BSPNode(new Polygon(new int[] { 288, 348, 348, 288 }, new int[] { 114, 114, 320, 320 }, 4),
				true);
		BSPNode area10 = new BSPNode(new Polygon(new int[] { 250, 288, 288, 250 }, new int[] { 345, 345, 442, 442 }, 4),
				false);
		BSPNode area10B = new BSPNode(
				new Polygon(new int[] { 288, 348, 348, 288 }, new int[] { 345, 345, 442, 442 }, 4), true);
		BSPNode area11 = new BSPNode(new Polygon(new int[] { 250, 390, 390, 250 }, new int[] { 442, 442, 490, 490 }, 4),
				false);
		BSPNode area12 = new BSPNode(new Polygon(new int[] { 288, 506, 506, 288 }, new int[] { 80, 80, 114, 114 }, 4),
				true);
		BSPNode area13 = new BSPNode(new Polygon(new int[] { 348, 390, 390, 348 }, new int[] { 114, 114, 320, 320 }, 4),
				false);
		BSPNode area14 = new BSPNode(new Polygon(new int[] { 348, 390, 390, 348 }, new int[] { 345, 345, 442, 442 }, 4),
				false);
		BSPNode area15 = new BSPNode(new Polygon(new int[] { 390, 460, 460, 390 }, new int[] { 114, 114, 320, 320 }, 4),
				true);
		BSPNode area16 = new BSPNode(new Polygon(new int[] { 390, 460, 460, 390 }, new int[] { 320, 320, 532, 532 }, 4),
				true);
		BSPNode area17 = new BSPNode(new Polygon(new int[] { 460, 506, 506, 460 }, new int[] { 114, 114, 320, 320 }, 4),
				false);
		BSPNode area17B = new BSPNode(
				new Polygon(new int[] { 460, 506, 506, 460 }, new int[] { 320, 320, 532, 532 }, 4), false);
		BSPNode area18 = new BSPNode(new Polygon(new int[] { 506, 602, 602, 506 }, new int[] { 80, 80, 414, 414 }, 4),
				true);
		BSPNode area19 = new BSPNode(new Polygon(new int[] { 506, 602, 602, 506 }, new int[] { 414, 414, 532, 532 }, 4),
				true);
		BSPNode area20 = new BSPNode(new Polygon(new int[] { 602, 644, 644, 602 }, new int[] { 80, 80, 414, 414 }, 4),
				false);
		BSPNode area21 = new BSPNode(new Polygon(new int[] { 602, 738, 738, 602 }, new int[] { 414, 414, 478, 478 }, 4),
				false);
		BSPNode area22 = new BSPNode(new Polygon(new int[] { 602, 738, 738, 602 }, new int[] { 478, 478, 532, 532 }, 4),
				true);
		BSPNode area23 = new BSPNode(new Polygon(new int[] { 644, 738, 738, 644 }, new int[] { 80, 80, 414, 414 }, 4),
				true);
		BSPNode area24 = new BSPNode(new Polygon(new int[] { 738, 800, 800, 738 }, new int[] { 80, 80, 262, 262 }, 4),
				false);
		BSPNode area25 = new BSPNode(new Polygon(new int[] { 738, 800, 800, 738 }, new int[] { 262, 262, 300, 300 }, 4),
				true);
		BSPNode area26 = new BSPNode(new Polygon(new int[] { 738, 800, 800, 738 }, new int[] { 300, 300, 478, 478 }, 4),
				false);
		BSPNode area27 = new BSPNode(new Polygon(new int[] { 738, 800, 800, 738 }, new int[] { 478, 478, 532, 532 }, 4),
				true);
		BSPNode area28 = new BSPNode(new Polygon(new int[] { 800, 950, 950, 800 }, new int[] { 262, 262, 532, 532 }, 4),
				true);
		BSPNode area29 = new BSPNode(new Polygon(new int[] { 800, 950, 950, 800 }, new int[] { 125, 125, 262, 262 }, 4),
				true);
		BSPNode area30 = new BSPNode(new Polygon(new int[] { 800, 950, 950, 800 }, new int[] { 80, 80, 125, 125 }, 4),
				true);
		area30.setFinishArea(true);
		Level1Finish = area30;

		// LINE NODES
		BSPNode v32 = new BSPNode(new Line(new Point2D.Float(644, 80), new Point2D.Float(644, 414)), area23, area20);
		BSPNode v31 = new BSPNode(new Line(new Point2D.Float(602, 414), new Point2D.Float(602, 80)), area18, v32);

		BSPNode v30 = new BSPNode(new Line(new Point2D.Float(602, 478), new Point2D.Float(738, 478)), area21, area22);
		BSPNode v29 = new BSPNode(new Line(new Point2D.Float(602, 414), new Point2D.Float(602, 532)), v30, area19);
		BSPNode v28 = new BSPNode(new Line(new Point2D.Float(738, 414), new Point2D.Float(506, 414)), v29, v31);
		BSPNode v27 = new BSPNode(new Line(new Point2D.Float(738, 478), new Point2D.Float(800, 478)), area26, area27);
		BSPNode v26 = new BSPNode(new Line(new Point2D.Float(800, 300), new Point2D.Float(738, 300)), v27, area25);

		BSPNode v25 = new BSPNode(new Line(new Point2D.Float(800, 262), new Point2D.Float(800, 532)), area28, v26);
		BSPNode v24 = new BSPNode(new Line(new Point2D.Float(800, 125), new Point2D.Float(950, 125)), area30, area29);
		BSPNode v23 = new BSPNode(new Line(new Point2D.Float(800, 262), new Point2D.Float(800, 80)), area24, v24);
		BSPNode v22 = new BSPNode(new Line(new Point2D.Float(738, 262), new Point2D.Float(950, 262)), v23, v25);
		BSPNode v21 = new BSPNode(new Line(new Point2D.Float(738, 80), new Point2D.Float(738, 532)), v22, v28);

		BSPNode v20 = new BSPNode(new Line(new Point2D.Float(460, 532), new Point2D.Float(460, 320)), area16, area17B);
		BSPNode v19 = new BSPNode(new Line(new Point2D.Float(460, 114), new Point2D.Float(460, 320)), area17, area15);
		BSPNode v18 = new BSPNode(new Line(new Point2D.Float(348, 345), new Point2D.Float(348, 442)), area14, area10B);
		BSPNode v17 = new BSPNode(new Line(new Point2D.Float(288, 442), new Point2D.Float(288, 345)), area10, v18);
		BSPNode v16 = new BSPNode(new Line(new Point2D.Float(250, 442), new Point2D.Float(390, 442)), v17, area11);

		BSPNode v15 = new BSPNode(new Line(new Point2D.Float(250, 490), new Point2D.Float(250, 345)), area6, v16);
		BSPNode v14 = new BSPNode(new Line(new Point2D.Float(142, 490), new Point2D.Float(390, 490)), v15, area7);
		BSPNode v13 = new BSPNode(new Line(new Point2D.Float(390, 345), new Point2D.Float(142, 345)), v14, area5);
		BSPNode v12 = new BSPNode(new Line(new Point2D.Float(390, 320), new Point2D.Float(390, 532)), v20, v13);
		BSPNode v11 = new BSPNode(new Line(new Point2D.Float(390, 320), new Point2D.Float(390, 114)), area13, v19);

		BSPNode v10 = new BSPNode(new Line(new Point2D.Float(348, 114), new Point2D.Float(348, 320)), v11, area9B);
		BSPNode v9 = new BSPNode(new Line(new Point2D.Float(250, 114), new Point2D.Float(250, 320)), area9, area4);
		BSPNode v8 = new BSPNode(new Line(new Point2D.Float(288, 320), new Point2D.Float(288, 114)), v9, v10);
		BSPNode v7 = new BSPNode(new Line(new Point2D.Float(114, 114), new Point2D.Float(114, 532)), area2, area1);
		BSPNode v6 = new BSPNode(new Line(new Point2D.Float(288, 80), new Point2D.Float(288, 114)), area12, area8);

		BSPNode v5 = new BSPNode(new Line(new Point2D.Float(250, 114), new Point2D.Float(250, 80)), area3, v6);
		BSPNode v4 = new BSPNode(new Line(new Point2D.Float(142, 320), new Point2D.Float(506, 320)), v8, v12);
		BSPNode v3 = new BSPNode(new Line(new Point2D.Float(142, 114), new Point2D.Float(142, 532)), v4, v7);
		BSPNode v2 = new BSPNode(new Line(new Point2D.Float(506, 114), new Point2D.Float(32, 114)), v3, v5);
		BSPNode v1 = new BSPNode(new Line(new Point2D.Float(506, 532), new Point2D.Float(506, 80)), v2, v21);

		// return the root
		return v1;
	}

	public static BSPNode buildBSPLevel2() {
		BSPNode area1 = new BSPNode(new Polygon(new int[] { 150, 280, 280, 150 }, new int[] { 8, 8, 322, 322 }, 4),
				true);
		BSPNode area2 = new BSPNode(new Polygon(new int[] { 150, 280, 280, 150 }, new int[] { 322, 322, 372, 372 }, 4),
				true);
		BSPNode area3 = new BSPNode(new Polygon(new int[] { 150, 312, 312, 150 }, new int[] { 372, 372, 418, 418 }, 4),
				true);
		BSPNode area4 = new BSPNode(new Polygon(new int[] { 150, 280, 280, 150 }, new int[] { 418, 418, 642, 642 }, 4),
				true);
		BSPNode area5 = new BSPNode(new Polygon(new int[] { 280, 312, 312, 280 }, new int[] { 8, 8, 192, 192 }, 4),
				false);
		BSPNode area6 = new BSPNode(new Polygon(new int[] { 280, 312, 312, 280 }, new int[] { 192, 192, 234, 234 }, 4),
				true);
		BSPNode area7 = new BSPNode(new Polygon(new int[] { 280, 312, 312, 280 }, new int[] { 234, 234, 322, 322 }, 4),
				false);
		BSPNode area8 = new BSPNode(new Polygon(new int[] { 280, 312, 312, 280 }, new int[] { 322, 322, 372, 372 }, 4),
				false);
		BSPNode area9 = new BSPNode(new Polygon(new int[] { 280, 312, 312, 280 }, new int[] { 418, 418, 642, 642 }, 4),
				false);
		BSPNode area10 = new BSPNode(new Polygon(new int[] { 312, 474, 474, 312 }, new int[] { 8, 8, 322, 322 }, 4),
				true);
		BSPNode area11 = new BSPNode(new Polygon(new int[] { 312, 474, 474, 312 }, new int[] { 322, 322, 372, 372 }, 4),
				true);
		BSPNode area12 = new BSPNode(new Polygon(new int[] { 312, 474, 474, 312 }, new int[] { 372, 372, 496, 496 }, 4),
				true);
		BSPNode area13 = new BSPNode(new Polygon(new int[] { 312, 428, 428, 312 }, new int[] { 496, 496, 642, 642 }, 4),
				true);
		BSPNode area14 = new BSPNode(new Polygon(new int[] { 474, 508, 508, 474 }, new int[] { 8, 8, 192, 192 }, 4),
				false);
		BSPNode area15 = new BSPNode(new Polygon(new int[] { 474, 762, 762, 474 }, new int[] { 192, 192, 226, 226 }, 4),
				false);
		BSPNode area16 = new BSPNode(new Polygon(new int[] { 474, 502, 502, 474 }, new int[] { 226, 226, 282, 282 }, 4),
				false);
		BSPNode area17 = new BSPNode(new Polygon(new int[] { 474, 602, 602, 474 }, new int[] { 282, 282, 322, 322 }, 4),
				true);
		BSPNode area18 = new BSPNode(new Polygon(new int[] { 474, 502, 502, 474 }, new int[] { 322, 322, 372, 372 }, 4),
				false);
		BSPNode area19 = new BSPNode(new Polygon(new int[] { 474, 602, 602, 474 }, new int[] { 372, 372, 408, 408 }, 4),
				true);
		BSPNode area20 = new BSPNode(new Polygon(new int[] { 474, 502, 502, 474 }, new int[] { 408, 408, 464, 464 }, 4),
				false);
		BSPNode area21 = new BSPNode(new Polygon(new int[] { 474, 732, 732, 474 }, new int[] { 464, 464, 496, 496 }, 4),
				false);
		BSPNode area22 = new BSPNode(new Polygon(new int[] { 428, 762, 762, 428 }, new int[] { 496, 496, 552, 552 }, 4),
				true);
		BSPNode area23 = new BSPNode(new Polygon(new int[] { 428, 636, 636, 428 }, new int[] { 552, 552, 574, 574 }, 4),
				false);
		BSPNode area24 = new BSPNode(new Polygon(new int[] { 428, 636, 636, 428 }, new int[] { 574, 574, 642, 642 }, 4),
				true);
		BSPNode area25 = new BSPNode(new Polygon(new int[] { 508, 1014, 1014, 508 }, new int[] { 8, 8, 94, 94 }, 4),
				true);
		BSPNode area26 = new BSPNode(new Polygon(new int[] { 508, 602, 602, 508 }, new int[] { 94, 94, 116, 116 }, 4),
				true);
		BSPNode area27 = new BSPNode(
				new Polygon(new int[] { 508, 1014, 1014, 508 }, new int[] { 116, 116, 192, 192 }, 4), true);
		BSPNode area28 = new BSPNode(new Polygon(new int[] { 502, 732, 732, 502 }, new int[] { 226, 226, 260, 260 }, 4),
				true);
		BSPNode area29 = new BSPNode(new Polygon(new int[] { 502, 602, 602, 502 }, new int[] { 260, 260, 282, 282 }, 4),
				true);
		BSPNode area30 = new BSPNode(new Polygon(new int[] { 502, 602, 602, 502 }, new int[] { 322, 322, 372, 372 }, 4),
				true);
		BSPNode area31 = new BSPNode(new Polygon(new int[] { 502, 602, 602, 502 }, new int[] { 408, 408, 464, 464 }, 4),
				true);
		BSPNode area32 = new BSPNode(new Polygon(new int[] { 602, 810, 810, 602 }, new int[] { 94, 94, 116, 116 }, 4),
				false);
		BSPNode area33 = new BSPNode(new Polygon(new int[] { 602, 632, 632, 602 }, new int[] { 260, 260, 282, 282 }, 4),
				false);
		BSPNode area34 = new BSPNode(new Polygon(new int[] { 602, 632, 632, 602 }, new int[] { 282, 282, 322, 322 }, 4),
				false);
		BSPNode area35 = new BSPNode(new Polygon(new int[] { 602, 632, 632, 602 }, new int[] { 322, 322, 372, 372 }, 4),
				false);
		BSPNode area36 = new BSPNode(new Polygon(new int[] { 602, 632, 632, 602 }, new int[] { 372, 372, 408, 408 }, 4),
				false);
		BSPNode area37 = new BSPNode(new Polygon(new int[] { 602, 632, 632, 602 }, new int[] { 408, 408, 436, 436 }, 4),
				false);
		BSPNode area38 = new BSPNode(new Polygon(new int[] { 602, 632, 632, 602 }, new int[] { 436, 436, 464, 464 }, 4),
				true);
		BSPNode area39 = new BSPNode(new Polygon(new int[] { 632, 732, 732, 632 }, new int[] { 260, 260, 282, 282 }, 4),
				true);
		BSPNode area40 = new BSPNode(new Polygon(new int[] { 632, 762, 762, 632 }, new int[] { 282, 282, 322, 322 }, 4),
				true);
		BSPNode area41 = new BSPNode(new Polygon(new int[] { 632, 732, 732, 632 }, new int[] { 322, 322, 372, 372 }, 4),
				true);
		BSPNode area42 = new BSPNode(new Polygon(new int[] { 632, 762, 762, 632 }, new int[] { 372, 372, 408, 408 }, 4),
				true);
		BSPNode area43 = new BSPNode(new Polygon(new int[] { 632, 732, 732, 632 }, new int[] { 408, 408, 464, 464 }, 4),
				true);
		BSPNode area44 = new BSPNode(new Polygon(new int[] { 636, 762, 762, 636 }, new int[] { 552, 552, 642, 642 }, 4),
				true);
		BSPNode area45 = new BSPNode(new Polygon(new int[] { 732, 762, 762, 732 }, new int[] { 226, 226, 282, 282 }, 4),
				false);
		BSPNode area46 = new BSPNode(new Polygon(new int[] { 732, 762, 762, 732 }, new int[] { 322, 322, 372, 372 }, 4),
				false);
		BSPNode area47 = new BSPNode(new Polygon(new int[] { 732, 762, 762, 732 }, new int[] { 408, 408, 496, 496 }, 4),
				false);
		BSPNode area48 = new BSPNode(new Polygon(new int[] { 810, 1014, 1014, 810 }, new int[] { 94, 94, 116, 116 }, 4),
				true);
		BSPNode area49 = new BSPNode(new Polygon(new int[] { 762, 928, 928, 762 }, new int[] { 192, 192, 246, 246 }, 4),
				true);
		BSPNode area50 = new BSPNode(new Polygon(new int[] { 762, 860, 860, 762 }, new int[] { 246, 246, 322, 322 }, 4),
				true);
		BSPNode area51 = new BSPNode(new Polygon(new int[] { 762, 860, 860, 762 }, new int[] { 322, 322, 642, 642 }, 4),
				true);
		BSPNode area52 = new BSPNode(
				new Polygon(new int[] { 928, 1014, 1014, 928 }, new int[] { 192, 192, 226, 226 }, 4), false);
		BSPNode area53 = new BSPNode(
				new Polygon(new int[] { 928, 1014, 1014, 928 }, new int[] { 226, 226, 246, 246 }, 4), true);
		BSPNode area54 = new BSPNode(new Polygon(new int[] { 860, 896, 896, 860 }, new int[] { 246, 246, 322, 322 }, 4),
				false);
		BSPNode area55 = new BSPNode(new Polygon(new int[] { 860, 896, 896, 860 }, new int[] { 322, 322, 642, 642 }, 4),
				false);
		BSPNode area56 = new BSPNode(
				new Polygon(new int[] { 896, 1014, 1014, 896 }, new int[] { 246, 246, 322, 322 }, 4), true);
		BSPNode area57 = new BSPNode(new Polygon(new int[] { 896, 960, 960, 896 }, new int[] { 322, 322, 372, 372 }, 4),
				false);
		BSPNode area58 = new BSPNode(
				new Polygon(new int[] { 896, 1014, 1014, 896 }, new int[] { 372, 372, 608, 608 }, 4), true);
		BSPNode area59 = new BSPNode(
				new Polygon(new int[] { 960, 1014, 1014, 960 }, new int[] { 322, 322, 372, 372 }, 4), true);
		BSPNode finishline = new BSPNode(
				new Polygon(new int[] { 896, 1014, 1014, 896 }, new int[] { 608, 608, 642, 642 }, 4), true);
		finishline.setFinishArea(true);
		Level2Finish = finishline;

		BSPNode vN2 = new BSPNode(new Line(new Point2D.Float(960, 372), new Point2D.Float(960, 322)), area57, area59);
		BSPNode vN1 = new BSPNode(new Line(new Point2D.Float(1014, 608), new Point2D.Float(896, 608)), finishline,
				area58);
		BSPNode vN = new BSPNode(new Line(new Point2D.Float(896, 372), new Point2D.Float(1014, 372)), vN2, vN1);
		BSPNode vM1 = new BSPNode(new Line(new Point2D.Float(860, 322), new Point2D.Float(860, 642)), area55, area51);
		BSPNode vM = new BSPNode(new Line(new Point2D.Float(896, 642), new Point2D.Float(896, 322)), vM1, vN);
		BSPNode vL3 = new BSPNode(new Line(new Point2D.Float(602, 372), new Point2D.Float(602, 408)), area36, area19);
		BSPNode vL2 = new BSPNode(new Line(new Point2D.Float(632, 408), new Point2D.Float(632, 372)), vL3, area42);
		BSPNode vL15 = new BSPNode(new Line(new Point2D.Float(632, 436), new Point2D.Float(602, 436)), area38, area37);
		BSPNode vL14 = new BSPNode(new Line(new Point2D.Float(632, 408), new Point2D.Float(632, 464)), area43, vL15);
		BSPNode vL13 = new BSPNode(new Line(new Point2D.Float(502, 408), new Point2D.Float(502, 464)), area31, area20);
		BSPNode vL12 = new BSPNode(new Line(new Point2D.Float(602, 464), new Point2D.Float(602, 408)), vL13, vL14);
		BSPNode vL11 = new BSPNode(new Line(new Point2D.Float(732, 464), new Point2D.Float(474, 464)), area21, vL12);
		BSPNode vL1 = new BSPNode(new Line(new Point2D.Float(732, 408), new Point2D.Float(732, 496)), area47, vL11);
		BSPNode vL = new BSPNode(new Line(new Point2D.Float(474, 408), new Point2D.Float(762, 408)), vL2, vL1);
		BSPNode vK = new BSPNode(new Line(new Point2D.Float(474, 496), new Point2D.Float(474, 372)), area12, vL);
		BSPNode vJ4 = new BSPNode(new Line(new Point2D.Float(636, 574), new Point2D.Float(428, 574)), area24, area23);
		BSPNode vJ3 = new BSPNode(new Line(new Point2D.Float(636, 552), new Point2D.Float(636, 642)), area44, vJ4);
		BSPNode vJ2 = new BSPNode(new Line(new Point2D.Float(428, 552), new Point2D.Float(762, 552)), area22, vJ3);
		BSPNode vJ1 = new BSPNode(new Line(new Point2D.Float(428, 496), new Point2D.Float(428, 642)), vJ2, area13);
		BSPNode vJ = new BSPNode(new Line(new Point2D.Float(312, 496), new Point2D.Float(762, 496)), vK, vJ1);
		BSPNode vI2 = new BSPNode(new Line(new Point2D.Float(280, 418), new Point2D.Float(280, 642)), area9, area4);
		BSPNode vI1 = new BSPNode(new Line(new Point2D.Float(312, 418), new Point2D.Float(150, 418)), vI2, area3);
		BSPNode vI = new BSPNode(new Line(new Point2D.Float(312, 372), new Point2D.Float(312, 642)), vJ, vI1);
		BSPNode vH7 = new BSPNode(new Line(new Point2D.Float(474, 372), new Point2D.Float(474, 322)), area11, area18);
		BSPNode vH6 = new BSPNode(new Line(new Point2D.Float(280, 372), new Point2D.Float(280, 322)), area2, area8);
		BSPNode vH5 = new BSPNode(new Line(new Point2D.Float(732, 372), new Point2D.Float(732, 322)), area41, area46);
		BSPNode vH4 = new BSPNode(new Line(new Point2D.Float(602, 372), new Point2D.Float(602, 322)), area30, area35);
		BSPNode vH3 = new BSPNode(new Line(new Point2D.Float(312, 322), new Point2D.Float(312, 372)), vH7, vH6);
		BSPNode vH2 = new BSPNode(new Line(new Point2D.Float(632, 322), new Point2D.Float(632, 372)), vH5, vH4);
		BSPNode vH1 = new BSPNode(new Line(new Point2D.Float(502, 372), new Point2D.Float(502, 322)), vH3, vH2);
		BSPNode vH = new BSPNode(new Line(new Point2D.Float(762, 372), new Point2D.Float(150, 372)), vI, vH1);
		BSPNode vG = new BSPNode(new Line(new Point2D.Float(762, 322), new Point2D.Float(762, 642)), vM, vH);
		BSPNode vF13 = new BSPNode(new Line(new Point2D.Float(602, 260), new Point2D.Float(602, 282)), area33, area29);
		BSPNode vF12 = new BSPNode(new Line(new Point2D.Float(632, 282), new Point2D.Float(632, 260)), vF13, area39);
		BSPNode vF11 = new BSPNode(new Line(new Point2D.Float(734, 260), new Point2D.Float(502, 260)), vF12, area28);
		BSPNode vF2 = new BSPNode(new Line(new Point2D.Float(502, 282), new Point2D.Float(502, 226)), area16, vF11);
		BSPNode vF1 = new BSPNode(new Line(new Point2D.Float(732, 226), new Point2D.Float(732, 282)), area45, vF2);
		BSPNode vF = new BSPNode(new Line(new Point2D.Float(474, 226), new Point2D.Float(762, 226)), area15, vF1);
		BSPNode vE2 = new BSPNode(new Line(new Point2D.Float(602, 322), new Point2D.Float(603, 282)), area17, area34);
		BSPNode vE1 = new BSPNode(new Line(new Point2D.Float(632, 282), new Point2D.Float(632, 322)), area40, vE2);
		BSPNode vE = new BSPNode(new Line(new Point2D.Float(762, 282), new Point2D.Float(474, 282)), vE1, vF);
		BSPNode vD14 = new BSPNode(new Line(new Point2D.Float(860, 322), new Point2D.Float(860, 246)), area50, area54);
		BSPNode vD13 = new BSPNode(new Line(new Point2D.Float(928, 226), new Point2D.Float(1014, 226)), area52, area53);
		BSPNode vD12 = new BSPNode(new Line(new Point2D.Float(896, 246), new Point2D.Float(896, 322)), area56, vD14);
		BSPNode vD11 = new BSPNode(new Line(new Point2D.Float(928, 246), new Point2D.Float(928, 192)), area49, vD13);
		BSPNode vD1 = new BSPNode(new Line(new Point2D.Float(762, 246), new Point2D.Float(1014, 246)), vD11, vD12);
		BSPNode vD = new BSPNode(new Line(new Point2D.Float(762, 192), new Point2D.Float(762, 322)), vD1, vE);
		BSPNode vC14 = new BSPNode(new Line(new Point2D.Float(602, 94), new Point2D.Float(602, 116)), area32, area26);
		BSPNode vC13 = new BSPNode(new Line(new Point2D.Float(810, 116), new Point2D.Float(810, 94)), vC14, area48);
		BSPNode vC12 = new BSPNode(new Line(new Point2D.Float(1014, 116), new Point2D.Float(506, 116)), area27, vC13);
		BSPNode vC11 = new BSPNode(new Line(new Point2D.Float(506, 94), new Point2D.Float(1014, 94)), area25, vC12);
		BSPNode vC1 = new BSPNode(new Line(new Point2D.Float(508, 192), new Point2D.Float(508, 8)), area14, vC11);
		BSPNode vC = new BSPNode(new Line(new Point2D.Float(474, 192), new Point2D.Float(1014, 192)), vC1, vD);
		BSPNode vA22 = new BSPNode(new Line(new Point2D.Float(280, 234), new Point2D.Float(312, 234)), area6, area7);
		BSPNode vA21 = new BSPNode(new Line(new Point2D.Float(312, 192), new Point2D.Float(280, 192)), vA22, area5);
		BSPNode vA2 = new BSPNode(new Line(new Point2D.Float(312, 8), new Point2D.Float(312, 322)), area10, vA21);
		BSPNode vA1 = new BSPNode(new Line(new Point2D.Float(280, 322), new Point2D.Float(280, 8)), area1, vA2);
		BSPNode vB = new BSPNode(new Line(new Point2D.Float(474, 322), new Point2D.Float(474, 8)), vA1, vC);
		BSPNode vA = new BSPNode(new Line(new Point2D.Float(8, 322), new Point2D.Float(1014, 322)), vB, vG);

		return vA;
	}
}
