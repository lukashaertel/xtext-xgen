package xgen.index;

public interface Pr {
	public static final Pr ID = new Pr() {
		@Override
		public Ix postprocess(Ix i) {
			return i;
		}
	};

	Ix postprocess(Ix i);
}
