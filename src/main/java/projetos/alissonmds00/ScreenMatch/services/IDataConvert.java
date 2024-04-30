package projetos.alissonmds00.ScreenMatch.services;

public interface IDataConvert {
    <T> T  obterDados(String json, Class <T> classe);
}
