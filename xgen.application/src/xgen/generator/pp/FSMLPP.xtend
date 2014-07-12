package xgen.generator.pp

class FSMLPP {
	public static val fsmlPP = (new ReplaceInitial).andThen(new RemoveRemainingInitials).andThen(
		new NameInputsAndActions).andThen(new NameStates).andThen(new UseStates)
}
