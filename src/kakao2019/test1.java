package kakao2019;


import java.util.*;

public class test1 {

    //오픈채팅방
    static String[] recorde = {
            "Enter uid1234 Muzi", "Enter uid4321 Prodo",
            "Leave uid1234 Muzi", "Enter uid1234 Prodo",
            "Change uid4321 Ryan"
    };
    public static String[] solution(String[] recorde) {

        List<String> list = new ArrayList<>();

        Map<String, String> idmap = new HashMap<>();

        for (String str : recorde) {
            StringTokenizer tokenizer = new StringTokenizer(str);
            String cmd = tokenizer.nextToken();
            if (cmd.equals("Enter") || cmd.equals("Change")) {
                String id = tokenizer.nextToken();
                String name = tokenizer.nextToken();
                idmap.put(id, name);
            }
        }

        for (String str : recorde) {
            StringTokenizer tokenizer = new StringTokenizer(str);
            String cmd = tokenizer.nextToken();
            if (cmd.equals("Enter")) {
                String id = tokenizer.nextToken();
                list.add(idmap.get(id) + "님이 들어왔습니다.");
            } else if (cmd.equals("Leave")) {
                String id = tokenizer.nextToken();
                list.add(idmap.get(id) + "님이 나갔습니다.");
            }
        }

        String[] ans = new String[list.size()];
        list.toArray(ans);
        return ans;
    }

    public static void main(String[] args) {
        String[] a = solution(recorde);
        System.out.println(Arrays.toString(a));
    }


}
