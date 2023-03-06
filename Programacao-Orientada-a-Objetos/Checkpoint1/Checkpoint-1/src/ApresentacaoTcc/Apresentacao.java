package ApresentacaoTcc;

import java.time.LocalDateTime;

public class Apresentacao {
    private LocalDateTime horarioEData;
    private Aluno alunoAnfitriao;

    public Apresentacao(LocalDateTime horarioEData, Aluno alunoAnfitriao) {
        this.horarioEData = horarioEData;
        this.alunoAnfitriao = alunoAnfitriao;
    }

    public LocalDateTime getHorarioEData() {
        return horarioEData;
    }

    public void setHorarioEData(LocalDateTime horarioEData) {
        this.horarioEData = horarioEData;
    }

    public Aluno getAlunoAnfitriao() {
        return alunoAnfitriao;
    }

    public void setAlunoAnfitriao(Aluno alunoAnfitriao) {
        this.alunoAnfitriao = alunoAnfitriao;
    }
}
