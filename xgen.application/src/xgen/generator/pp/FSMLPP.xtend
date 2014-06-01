package xgen.generator.pp

class FSMLPP {
	public static val fsmlPP = 
			(new ReplaceInitial)
	.andThen(new RemoveRemainingInitials)
	.andThen(new ReplaceInputValue)
	.andThen(new ReplaceActionValue)
	.andThen(new NameStates)
	.andThen(new UseStates)
}
