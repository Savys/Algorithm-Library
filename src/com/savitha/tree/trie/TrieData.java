//package com.sriram.tree;
package com.savitha.tree.trie;
public class TrieData {
	public String data;
	public Integer count;

	public TrieData(String data) {
		this.data = data;
		this.count = 1;
	}
	@Override
	public String toString() {
		return  data + "[" + count + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrieData other = (TrieData) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
}
