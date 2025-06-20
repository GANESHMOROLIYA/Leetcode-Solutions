class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            st.push(sandwiches[i]);
        }
        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }
        int count = 0;
        while (q.size() != 0) {
            if (st.peek() != q.peek()) {
                q.add(q.remove());
                count++;
            } else {
                q.remove();
                st.pop();
                count = 0;
            }
            if (count == q.size()) {
                break;
            }
        }
        return q.size();
    }
}