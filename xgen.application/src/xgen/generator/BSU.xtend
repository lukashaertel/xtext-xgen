package xgen.generator

import java.math.BigDecimal

class BSU {
	static val KB = 1024BD
	static val MB = KB * KB
	static val GB = KB * MB
	static val TB = KB * GB
	static val PB = KB * TB
	static val EB = KB * PB

	def static String prettySize(BigDecimal size) {
		if(size < KB) return (size     ) + " byte";
		if(size >= KB && size < MB) return (size / KB) + " Kb";
		if(size >= MB && size < GB) return (size / MB) + " Mb";
		if(size >= GB && size < TB) return (size / GB) + " Gb";
		if(size >= TB && size < PB) return (size / TB) + " Tb";
		if(size >= PB && size < EB) return (size / PB) + " Pb";
		if(size >= EB) return (size / EB) + " Eb";

		return "???";
	}
}
