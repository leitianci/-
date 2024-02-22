package experiment.experiment_3;

public class RecruitListener implements RecruitListenerInterface{
    @Override
    public void recruit(RecruitEvent e) {
        System.out.println("触发招生事件");
    }
}
