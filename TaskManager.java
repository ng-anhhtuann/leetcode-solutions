public class TaskManager {
    private PriorityQueue<int[]> q;
    private Map<Integer, Integer> taskPoint;
    private Map<Integer, Integer> taskUser;

    public TaskManager(List<List<Integer>> tasks) {
        q = new PriorityQueue<>((a, b) -> {
            if (b[0] != a[0])
                return b[0] - a[0];
            return b[1] - a[1];
        });
        taskPoint = new HashMap<>();
        taskUser = new HashMap<>();
        for (List<Integer> t : tasks)
            add(t.get(0), t.get(1), t.get(2));
    }

    public void add(int userId, int taskId, int priority) {
        q.add(new int[] { priority, taskId });
        taskPoint.put(taskId, priority);
        taskUser.put(taskId, userId);
    }

    public void edit(int taskId, int newPriority) {
        q.add(new int[] { newPriority, taskId });
        taskPoint.put(taskId, newPriority);
    }

    public void rmv(int taskId) {
        taskPoint.put(taskId, -1);
    }

    public int execTop() {
        while (!q.isEmpty()) {
            int[] t = q.poll();
            int p = t[0], id = t[1];
            if (taskPoint.getOrDefault(id, -2) == p) {
                taskPoint.put(id, -1);
                return taskUser.getOrDefault(id, -1);
            }
        }
        return -1;
    }
}{

}
