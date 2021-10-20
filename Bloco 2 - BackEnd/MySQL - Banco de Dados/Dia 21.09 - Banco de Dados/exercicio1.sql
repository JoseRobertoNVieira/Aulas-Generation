select * from tb_personagem where poder_de_ataque > 2000;
select * from tb_personagem where poder_de_ataque between 1000 and 2000;
select * from tb_personagem where nome like "%C%";

select tb_personagem.nome,tb_personagem.nivel,tb_classe.nome_classe
from tb_personagem inner join tb_classe on tb_personagem.id = tb_classe.id;

select * from tb_personagem where classe_id = 3;



