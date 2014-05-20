package xgen.util;

public class PairingUtil
{
	public static long cantorX(long z)
	{
		long j = (long) Math.floor(Math.sqrt(0.25 + 2 * z) - 0.5);
		return j - (z - j * (j + 1) / 2);
	}

	public static long cantorY(long z)
	{
		long j = (long) Math.floor(Math.sqrt(0.25 + 2 * z) - 0.5);
		return z - j * (j + 1) / 2;
	}

	public static long fixLeftX(long z, long leftLength)
	{
		return z % leftLength;
	}

	public static long fixLeftY(long z, long leftLength)
	{
		return z / leftLength;
	}

	public static long fixRightX(long z, long rightLength)
	{
		return z / rightLength;
	}

	public static long fixRightY(long z, long rightLength)
	{
		return z % rightLength;
	}
}
