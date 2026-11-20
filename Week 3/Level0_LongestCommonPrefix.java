class Level0_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) 
            minLength = Math.min(minLength, strs[i].length());

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < minLength; i++) {
            char ch = strs[0].charAt(i);

            for (String str: strs) 
                if (str.charAt(i) != ch) return sb.toString();

            sb.append(ch);
        }

        return sb.toString();
    }
}
