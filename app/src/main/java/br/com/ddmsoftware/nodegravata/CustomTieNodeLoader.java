package br.com.ddmsoftware.nodegravata;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmoraes on 13/07/2017.
 */

public class CustomTieNodeLoader {

    int nodeStepPicture;
    String nodeStepDescription;

    public int getNodeStepPicture() {
        return nodeStepPicture;
    }

    public void setNodeStepPicture(int nodeStepPicture) {
        this.nodeStepPicture = nodeStepPicture;
    }

    public String getNodeStepDescription() {
        return nodeStepDescription;
    }

    public void setNodeStepDescription(String nodeStepDescription) {
        this.nodeStepDescription = nodeStepDescription;
    }

    CustomTieNodeLoader(){

    }

    CustomTieNodeLoader(int nodeStepPicture, String nodeStepDescription){
        this.nodeStepPicture = nodeStepPicture;
        this.nodeStepDescription = nodeStepDescription;
    }

    public List loadFourInHandsSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {

            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand01, "1. Comece com a ponta pequena um pouco acima do seu umbigo. Mova apenas a ponta larga."));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand02, "2. Passe a ponta larga sobre a extremidade pequena, em direção à esquerda"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand03, "3. Passe a ponta sob a pequena extremidade e à direita"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand04, "4. Passe pela frente e para a esquerda"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand05, "5. Gire a partir do pescoço para baixo"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand06, "6. Passe através do loop que você acabou de fazer na frente"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand07, "7. Aperte o nó puxando para baixo na extremidade larga. Deslize o nó para cima e ajuste."));

        } else{

            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand01, "1. Begin with the small end slightly above your belly-button (will vary depending on your height and the length and thickness of your tie). Only move the active (wide) end.;   "));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand02, "2. Wide end over the small end to the left"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand03, "3. Under the small end and to the right"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand04, "4. Across the front and to the left"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand05, "5. Up into the neck loop from underneath"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand06, "6. Down through the loop you have just made in the front"));
            myList.add(new CustomTieNodeLoader(R.drawable.fourinhand07, "7. Tighten the knot by pulling down on the wide end. Slide the knot up and adjust."));
        }

        return myList;
    }

    public List loadHalfWindsorSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt"))  {

            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor01, "1. Comece com a ponta larga da gravata à direita e a extremidade pequena à esquerda. A ponta da extremidade pequena deve descansar ligeiramente acima do seu barriga-botão (isso variará dependendo da sua altura e do comprimento e espessura da sua gravata). Mova apenas a ponta larga."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor02, "2. Extremidade larga sobre a extremidade pequena para a esquerda."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor03, "3. Sob a pequena extremidade e à direita."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor04, "4. Até o centro, em direção ao laço do pescoço. Através do laço do pescoço e à esquerda."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor05, "5. Através da frente, sobre a direita."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor06, "6. Para cima no pescoço do pescoço por baixo."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor07, "7. Através do loop que você acabou de criar na frente."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor08, "8. Aperte o nó puxando para baixo na extremidade larga. Deslize o nó para cima e ajuste."));

        } else {

            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor01,"1. Start with the wide end of the tie on the right and the small end on the left. The tip of the small end should rest slightly above your belly-button (this will vary depending on your height and the length and thickness of your tie). Only move the active (wide) end.;"));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor02,"2. Wide end over the small end to the left."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor03,"3. Under the small end and to the right."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor04,"4. Up to the center, towards neck loop. Through the neck loop and to the left."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor05,"5. Across the front, over to the right."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor06,"6. Up into the neck loop from underneath."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor07,"7. Down through the loop you have just created in the front."));
            myList.add(new CustomTieNodeLoader(R.drawable.half_windsor08,"8. Tighten the knot by pulling down on the wide end. Slide the knot up and adjust."));

        }

        return myList;


    }


    public List loadFullWindsorSteps(String lang){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt"))  {

            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor1,"1. Comece com a ponta larga da gravata à direita e a extremidade pequena à esquerda. A ponta pequena deve descansar um pouco acima do umbigo.  Mova apenas a ponta larga"));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor2,"2. Passe a ponta larga sobre a ponta  pequena para a esquerda. "));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor3,"3. Passe dentro da volta do pescoço, para baixo. "));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor4,"4. Passe para a esquerda. "));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor5,"5. Passe pela parte de trás da extremidade pequena à direita. "));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor6,"6. Centralize, em direção ao laço do pescoço. "));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor7,"7. Através do laço do pescoço e mova para a direita. "));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor8,"8. Cruze pela  frente para a esquerda. "));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor9,"9. Passe dentro da volta do pescoço, para baixo. "));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor10,"10. Mova para baixo, através do laço que você acabou de criar, pela frente."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor11,"11. Aperte o nó puxando para baixo na ponta larga. Deslize o nó para cima e ajuste."));

        } else {

            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor1,"1. Start with the wide end of the tie on the right and the small end on the left. The tip of the small end should rest slightly above your belly-button (this will vary depending on your height and the length & thickness of your tie). Only move the active (wide) end."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor2,"2. Wide end over the small end to the left."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor3,"3. Up into the neck loop from underneath."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor4,"4. Down to the left."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor5,"5. Around the back of the small end to the right."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor6,"6. Up to the center, towards neck loop."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor7,"7. Through the neck loop and down to the right."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor8,"8. Across the front to the left."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor9,"9. Up into the neck loop from underneath."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor10,"10. Down through the loop you've just created in the front."));
            myList.add( new CustomTieNodeLoader(R.drawable.full_windsor11,"11. Tighten the knot by pulling down on the wide end. Slide the knot up & adjust."));

        }


        return  myList;
    }


    public List loadNickySteps(String lang){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {
            myList.add(new CustomTieNodeLoader(R.drawable.nicky1, "1. A ponta larga da gravata deve estar do seu lado direito e a outra ponta à esquerda, de dentro para fora."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky2, "2. Passe a ponta estreita sobre a outra extremidade. Agora, são formadas três áreas (esquerda, direita e centro)."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky3, "3. Passe a ponta larga sobre a ponta estreita e para a área central."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky4, "4. Passe a ponta larga para baixo, do Centro para a Direita."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky5, "5. Passe a ponta larga sobre o nó, da direita para a esquerda."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky6, "6. Passe a ponta larga sob a parte estreita da gravata, da área esquerda para a área central."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky7, "7. Passe a ponta larga para baixo e passe pelo laço na frente. Certifique-se de que o nó está apertado."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky8, "8. Use uma mão para puxar a extremidade estreita suavemente e use a outra mão para mover o nó até atingir o centro do colarinho."));
        }else {


            myList.add(new CustomTieNodeLoader(R.drawable.nicky1, "1. At the beginning, the wide end of the tie should be on your right side and the other end should be on your left side. Note that the tie should begin inside out."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky2, "2. Cross the narrow end over the other end. Now three regions are formed (Left, Right and Center)."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky3, "3. Bring the wide end over the narrow end to the Center region."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky4, "4. Bring the wide end down from Center to Right."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky5, "5. Bring the wide end over the knot from Right to Left."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky6, "6. Bring the wide end under the narrow part of the tie from the Left region to the Center region."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky7, "7. Bring the wide end down and pass the loop in front. Ensure that the knot is tightened."));
            myList.add(new CustomTieNodeLoader(R.drawable.nicky8, "8. Use one hand to pull the narrow end down gently and use the other hand to move the knot up until it reaches the center of the collar."));
        }
        return  myList;
    }


    public List loadBowTieSteps(String lang){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {

            myList.add(new CustomTieNodeLoader(R.drawable.bowtie1, "1. Cruze a ponta mais longa sobre a ponta mais curta."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie2, "2. Mova a ponta longa em onde as duas extremidades se cruzam."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie3, "3. Dobre a extremidade pendente para fazer um laço."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie4, "4. Passe a extremidade mais longa sobre o centro magro do arco. "));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie5, "5. Aperte o arco junto na frente da ponta longa."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie6, "6. Passe o meio da extremidade pendurada de volta, através do nó."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie7, ""));
        } else {
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie1, "1. Cross the longer end over the shorter end."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie2, "2. Loop the long end under where the two ends cross."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie3, "3. Fold the dangling end to make a loop."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie4, "4. Drop the longer end over the skinny center of the bow. "));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie5, "5. Pinch the bow together in front of the long end."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie6, "6. Feed the middle of the dangling end back through the knot."));
            myList.add(new CustomTieNodeLoader(R.drawable.bowtie7, ""));
        }
        return  myList;
    }

    public List loadKelvinSteps(String lang){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {

            myList.add(new CustomTieNodeLoader(R.drawable.kelvin1, "1. Comece com a parte de trás do gravata voltada para longe de você, a ponta larga está à direita e a ponta pequena está à esquerda. Mova apenas a ponta larga"));
            myList.add(new CustomTieNodeLoader(R.drawable.kelvin2, "2. Passe a ponta larga sob a ponta pequena para a esquerda."));
            myList.add(new CustomTieNodeLoader(R.drawable.kelvin3, "3. Passe sob a ponta pequena para a direita."));
            myList.add(new CustomTieNodeLoader(R.drawable.kelvin4, "4. Passe sob o a ponta pequena para a esquerda."));
            myList.add(new CustomTieNodeLoader(R.drawable.kelvin5, "5. Passe sob a ponta pequena para a direita."));
            myList.add(new CustomTieNodeLoader(R.drawable.kelvin6, "6. Passe pelo laço do pescoço para baixo."));
            myList.add(new CustomTieNodeLoader(R.drawable.kelvin7, "7. Direcione para baixo, através do laço que você acabou de fazer na frente."));
            myList.add(new CustomTieNodeLoader(R.drawable.kelvin8, "8. Puxe para a extremidade larga para apertar. Deslize o nó para ajustar."));
        }
        else {
            myList.add( new CustomTieNodeLoader(R.drawable.kelvin1,"1. Start with the backside of the tie facing away from you, the wide end is on the right and the small end is on the left. Move only the active (wide) end."));
            myList.add( new CustomTieNodeLoader(R.drawable.kelvin2,"2. Wide end under the small end to the left."));
            myList.add( new CustomTieNodeLoader(R.drawable.kelvin3,"3. Across the small end to the right."));
            myList.add( new CustomTieNodeLoader(R.drawable.kelvin4,"4. Under the small end to the left."));
            myList.add( new CustomTieNodeLoader(R.drawable.kelvin5,"5. Across the small end to the right."));
            myList.add( new CustomTieNodeLoader(R.drawable.kelvin6,"6. Up into the neck loop from underneath."));
            myList.add( new CustomTieNodeLoader(R.drawable.kelvin7,"7. Down through the loop you've just made in the front."));
            myList.add( new CustomTieNodeLoader(R.drawable.kelvin8,"8. Pull down on the wide end to tighten. Slide the knot up to adjust."));
        }
        return  myList;
    }

    public List loadOrientalSteps(String lang){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {

            myList.add(new CustomTieNodeLoader(R.drawable.oriental1, "1. Comece com a parte de trás da gravata voltada para longe de você, a ponta larga está à direita e a ponta pequena fica à esquerda."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental2, "2. Passe a ponta larga sob a ponta pequena para a esquerda."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental3, "3. Atravesse a ponta pequena para a direita."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental4, "4. Passe por cima do lado do pescoço por baixo."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental5, "5. Passe por dentro do laço que você acabou de fazer na frente."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental6, "6. Puxe para baixo na ponta larga para apertar. Deslize o nó para ajustar."));
        } else {
            myList.add(new CustomTieNodeLoader(R.drawable.oriental1, "1. Start with the backside of the tie facing away from you, the wide end is on the right and the small end is on the left."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental2, "2. Wide end under the small end to the left."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental3, "3. Across the small end to the right."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental4, "4. Up into the neck loop from underneath."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental5, "5. Down through the loop you've just made in the front."));
            myList.add(new CustomTieNodeLoader(R.drawable.oriental6, "6. Pull down on the wide end to tighten. Slide the knot up to adjust."));
        }
            return  myList;
    }

    public List loadPrattSteps(String lang){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

         if (lang.equals("pt")) {

             myList.add(new CustomTieNodeLoader(R.drawable.pratt1, "Drapeje a gravata ao redor de sua gola - com a costura (lado traseiro) virada para fora. A extremidade grossa deve estar pendurada à sua esquerda e a extremidade fina à sua direita. "));
             myList.add(new CustomTieNodeLoader(R.drawable.pratt2, "Cruze a extremidade grossa embaixo da extremidade fina - formando uma forma de X abaixo do seu queixo. Isso cria um loop semelhante ao usado para amarrar um Half-Windsor. "));
             myList.add(new CustomTieNodeLoader(R.drawable.pratt3, "Passe a extremidade grossa através do loop. Traga de volta para o lado direito do nó mais uma vez. "));
             myList.add(new CustomTieNodeLoader(R.drawable.pratt4, "Puxe a extremidade grossa todo o caminho para baixo - com a costura voltada para fora novamente. Volte a ponta para que aponte para a esquerda. "));
             myList.add(new CustomTieNodeLoader(R.drawable.pratt5, "Traga a extremidade grossa horizontalmente pela frente do nó (da direita para a esquerda). Neste ponto, a costura da extremidade grossa agora está voltada para dentro. "));
             myList.add(new CustomTieNodeLoader(R.drawable.pratt6, "Deslize a extremidade grossa através do loop (vindo por baixo). A vontade fará a costura virar para fora mais uma vez. Mantenha seu dedo no lugar. "));
             myList.add(new CustomTieNodeLoader(R.drawable.pratt7, "Puxe a extremidade grossa todo o caminho pela banda horizontal. Aperte-o firmemente no lugar. Agora você tem a estrutura acabada do nó (deve ficar sem sua ajuda se tentar liberá-la) "));
             myList.add(new CustomTieNodeLoader(R.drawable.pratt8, "Finalmente, ajuste a gravata agarrando o nó com uma mão - enquanto puxa a extremidade estreita suavemente com a outra. Corrija a covinha da gravata para que fique ainda melhor com você. "));
         } else {

             myList.add( new CustomTieNodeLoader(R.drawable.pratt1,"Drape the necktie around your collar – with its seam (back side) facing outward. The thick end should be hanging on your left, and the thin end on your right."));
             myList.add( new CustomTieNodeLoader(R.drawable.pratt2,"Cross the thick end underneath the thin end – forming an X-shape below your chin. This creates a similar loop to the one used in tying a Half-Windsor."));
             myList.add( new CustomTieNodeLoader(R.drawable.pratt3,"Pass the thick end through the loop. Bring it back out over to the right side of the knot once more."));
             myList.add( new CustomTieNodeLoader(R.drawable.pratt4,"Pull the thick end all the way downward – with its seam facing outward once again. Flip the tip so that it’s pointing to your left."));
             myList.add( new CustomTieNodeLoader(R.drawable.pratt5,"Bring the thick end horizontally across the front of the knot (from right to left). At this point, the seam of the thick end is now facing inward."));
             myList.add( new CustomTieNodeLoader(R.drawable.pratt6,"Slip the thick end through the loop (coming from underneath it). The will make the seam face outward once again. Keep your finger in place."));
             myList.add( new CustomTieNodeLoader(R.drawable.pratt7,"Pull the thick end all the way down through the horizontal band. Snug it firmly into place. You now have the finished structure of the knot (it should stay put without your help if you try releasing it)."));
             myList.add( new CustomTieNodeLoader(R.drawable.pratt8,"Finally, adjust the necktie by grasping the knot with one hand – while pulling on the narrow end gently with the other. Fix the dimple of the tie so it looks even better on you."));

         }
        return  myList;
    }


    public List<CustomTieNodeLoader> loadStAndrewSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {

            myList.add(new CustomTieNodeLoader(R.drawable.standrew1, "Coloque a gravata em volta do colar com a parte traseira exposta. A extremidade grossa deve estar pendurada na sua esquerda, enquanto a extremidade fina está à sua direita."));
            myList.add(new CustomTieNodeLoader(R.drawable.standrew2, "Atravesse a extremidade fina horizontalmente sobre a extremidade grossa, formando uma forma de X no seu queixo. Use uma mão para manter uma compreensão firme do ponto de interseção."));
            myList.add(new CustomTieNodeLoader(R.drawable.standrew3, "Traga a extremidade grossa horizontalmente na frente da extremidade fina. Neste ponto, a extremidade grossa deve apontar para a esquerda - enquanto a extremidade fina está pendurada para baixo."));
            myList.add(new CustomTieNodeLoader(R.drawable.standrew4, "Continue fazendo um loop na extremidade grossa ao redor da extremidade fina - passando horizontalmente atrás da extremidade fina da esquerda para a direita. Neste ponto, a extremidade grossa agora deve apontar para a direita - com a parte traseira exposta."));
            myList.add(new CustomTieNodeLoader(R.drawable.standrew5, "Deslize a extremidade grossa verticalmente para cima e sobre a frente do nó. Em seguida, coloque-a de volta para baixo atrás do nó. Você deve terminar este passo com a extremidade grossa apontando para baixo - diretamente atrás da extremidade fina."));
            myList.add(new CustomTieNodeLoader(R.drawable.standrew6, "Traga a extremidade grossa horizontalmente para a esquerda da extremidade fina. A costura ainda deve estar voltada para fora. Isto é suposto para puxar para baixo o loop vertical que você fez através do nó no Passo # 5."));
            myList.add(new CustomTieNodeLoader(R.drawable.standrew7, "Traga a extremidade grossa horizontalmente na frente do nó da esquerda para a direita - cobrindo o loop vertical que você fez na Etapa 5. Isso formará uma faixa horizontal na frente. Deslize um dedo através dele - você vai precisar disso Para o próximo passo. "));
            myList.add(new CustomTieNodeLoader(R.drawable.standrew8, "Traga o fim grosso atrás do nó, e coloque-o através do loop horizontal que você fez no Passo 7. Aqui é onde a forma do nó está completa."));
            myList.add(new CustomTieNodeLoader(R.drawable.standrew9, "Puxe a extremidade grossa até o fim. Aperte o nó agarrando-o com uma mão - enquanto puxa cuidadosamente a extremidade grossa com a outra."));

        } else {

            myList.add( new CustomTieNodeLoader(R.drawable.standrew1,"Drape the necktie around your collar with the backside exposed. The thick end should be hanging on your left, while the thin end is over to your right."));
            myList.add( new CustomTieNodeLoader(R.drawable.standrew2,"Cross the thin end horizontally over the thick end, forming an X-shape under your chin. Use one hand to keep a firm grasp of the intersection point."));
            myList.add( new CustomTieNodeLoader(R.drawable.standrew3,"Bring the thick end horizontally across the front of the thin end. At this point, the thick end should be pointing to your left – while the thin end is hanging straight down."));
            myList.add( new CustomTieNodeLoader(R.drawable.standrew4,"Continue looping the thick end around the thin end – passing it horizontally behind the thin end from left to right. At this point, the thick end should now be pointing to your right – with its backside exposed."));
            myList.add( new CustomTieNodeLoader(R.drawable.standrew5,"Flip the thick end vertically up and over the front of the knot. Then tuck it back downward behind the knot. You should finish this step with the thick end pointing straight down – directly behind the thin end."));
            myList.add( new CustomTieNodeLoader(R.drawable.standrew6,"Bring the thick end horizontally to the left of the thin end. The seam should still be facing outward. This is supposed to pull down the vertical loop you made across the knot in Step #5."));
            myList.add( new CustomTieNodeLoader(R.drawable.standrew7,"Bring the thick end horizontally across the front of the knot from left to right – covering the vertical loop you made in Step #5. This will form a horizontal band in the front. Slip a finger through it – you’ll be needing it for the next step."));
            myList.add( new CustomTieNodeLoader(R.drawable.standrew8,"Bring the thick end up behind the knot, and tuck it through the horizontal loop you made in Step #7. This is where the shape of the knot is completed."));
            myList.add( new CustomTieNodeLoader(R.drawable.standrew9,"Pull the thick end all the way through. Tighten the knot by grasping it with one hand – while pulling carefully on the thick end with the other."));
        }
        return  myList;
    }

    public List<CustomTieNodeLoader> loadBalthusSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {
            myList.add(new CustomTieNodeLoader(R.drawable.balthus1,  "1. Comece com uma parte de trás da gravata voltada para a frente com uma extremidade larga da gravata à direita e uma extremidade pequena à esquerda. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus2,  "2. Extremidade larga sob a extremidade pequena para a esquerda. Até o centro, em direção ao campo do pescoço. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus3,  "3. Através do laço do pescoço e para a direita. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus4,  "4. Até o centro, em direção ao campo de pescoço. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus5,  "5. Através do laço do pescoço e para baixo para a esquerda. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus6,  "6. Até o centro, em direção ao campo do pescoço. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus7,  "7. Através do laço do pescoço e para a direita. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus8,  "8. Através da frente da extremidade pequena para a esquerda. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus9,  "9. No alto do pescoço de baixo. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus10, "10. Através do loop que você acabou de fazer na frente. "));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus11, "11. Puxe para uma extremidade larga para apertar. Deslize o nó para ajustar. "));
        }
        else {
            myList.add(new CustomTieNodeLoader(R.drawable.balthus1, "1. Begin with the backside of your tie facing forward with the wide end of the tie on the right and the small end on the left."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus2, "2. Wide end under the small end to the left. Up to the center, towards the neck loop."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus3, "3. Through the neck loop and down to the right."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus4, "4. Up to the center, towards the neck loop."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus5, "5. Through the neck loop and down to the left."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus6, "6. Up to the center, towards the neck loop."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus7, "7. Through the neck loop and down to the right."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus8, "8. Across the front of the small end to the left."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus9, "9. Up into the neck loop from underneath."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus10, "10. Down through the loop you've just made in the front."));
            myList.add(new CustomTieNodeLoader(R.drawable.balthus11, "11. Pull down on the wide end to tighten. Slide the knot up to adjust."));
        }
        return  myList;
    }

    public List<CustomTieNodeLoader> loadHanoverSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {
            myList.add(new CustomTieNodeLoader(R.drawable.hanover1,  "1. No início, a extremidade larga da gravata deve estar no seu lado direito e a outra extremidade deve estar no seu lado esquerdo. Observe que a gravata deve começar de dentro para fora. "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover2,  "2. Atravesse a extremidade estreita sobre a outra extremidade. Agora, são formadas três regiões (esquerda, direita e centro). "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover3,  "3. Traga a extremidade larga sobre a extremidade estreita da esquerda para a direita. "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover4,  "4. Traga o fim largo da região Direita para a região do Centro. "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover5,  "5. Traga a extremidade larga sobre o nó de gravata da região Centro para a região esquerda. "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover6,  "6. Traga a extremidade larga sob a extremidade estreita da esquerda para a direita. "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover7,  "7. Traga o fim largo do Direito para o Centro. "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover8,  "8. Traga a extremidade larga por baixo do nó de gravata para a região esquerda. "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover9,  "9. Traga a extremidade larga sobre o nó de gravata para a região Direita. "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover10, "10. Traga o fim largo da região Direita para a região do Centro. "));
            myList.add(new CustomTieNodeLoader(R.drawable.hanover11, "11. Traga a extremidade larga para baixo e passe o loop na frente. Certifique-se de que o nó está apertado. "));

        } else {
            myList.add( new CustomTieNodeLoader(R.drawable.hanover1,"1. At the beginning, the wide end of the tie should be on your right side and the other end should be on your left side. Note that the tie should begin inside out."));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover2,"2. Cross the narrow end over the other end. Now three regions are formed (Left, Right and Center)."));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover3,"3. Bring the wide end over the narrow end from Left to Right."));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover4,"4. Bring the wide end up from the Right region to the Center region."));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover5,"5. Bring the wide end over the tie knot from the Center region to the Left region."));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover6,"6. Bring the wide end under the narrow end from Left to Right."));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover7,"7. Bring the wide end up from Right to Center."));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover8,"8. Bring the wide end underneath the tie knot to the Left region."));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover9,"9. Bring the wide end over the tie knot to the Right region."));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover10,"10. Bring the wide end up from the Right region to the Center region." ));
            myList.add( new CustomTieNodeLoader(R.drawable.hanover11,"11. Bring the wide end down and pass the loop in front. Ensure that the knot is tightened."));

        }
        return  myList;

    }

    public List loadPlattsburgSteps(String lang) {

        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh9,""));
        return  myList;

    }

    public List<CustomTieNodeLoader> loadGranttchesterSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter11,""));
        return  myList;

    }

    public List loadVictoriaSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {

            myList.add( new CustomTieNodeLoader(R.drawable.victoria1,"Drape a gravata ao redor do colar com a costura coberta. O lado grosso deve pendurar no lado esquerdo, enquanto a extremidade estreita fica à sua direita."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria2,"Cruze a extremidade grossa da gravata horizontalmente na frente da extremidade estreita, formando uma forma de X abaixo do seu queixo. A extremidade grossa agora deve estar no lado direito."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria3,"Continue empacotando a extremidade grossa em torno da extremidade estreita, agora passando na frente do nó da esquerda para a direita. Aponte a ponta da extremidade grossa em direção à parte de trás - preparando-a para outra volta."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria4,"Faça uma segunda volta em torno do fim estreito - trazendo a gravata para trás e cruzando novamente da direita para a esquerda. Essa dobra horizontal será empilhada em cima da anterior. Isso cria a maior parte do nó."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria5,"Traga a extremidade grossa horizontalmente na parte frontal do nó novamente - cruzando da esquerda para a direita."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria6,"Insira a extremidade grossa através do loop em volta do colar, vindo por debaixo dela. Ele deve acabar na frente do seu queixo - com a costura exposta mais uma vez."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria7,"Alimente a extremidade grossa para baixo através da banda horizontal que você criou no Passo 5. A extremidade grossa deve ser puxada completamente - encontrando-se diretamente sobre a extremidade estreita e cobrindo."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria8,"Acerte a ponta grossa no lugar. Neste ponto, você tem a forma acabada do nó. Ele deve ficar sozinho mesmo se você mover as mãos para longe."));


        } else {

            myList.add( new CustomTieNodeLoader(R.drawable.victoria1,"Drape the necktie around your collar with its seam (back side) covered. The thick end should hang on your left side, while the narrow end is on your right."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria2,"Cross the thick end of the tie horizontally in front of the narrow end, forming an X-shape below your chin. The thick end should now be on the right side."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria3,"Continue wrapping the thick end around the narrow end, now crossing in front of the knot from left to right. Point the tip of the thick end toward the back – preparing it for another turn."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria4,"Make a second turn around the narrow end – bringing the tie behind it and crossing again from right to left. This horizontal fold will be stacked on top of the previous one. This creates the bulk of the knot."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria5,"Bring the thick end horizontally across the front of the knot again – crossing from left to right."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria6,"Insert the thick end through the loop around your collar, coming from underneath it. It should end up in front of your chin – with the seam exposed once more."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria7,"Feed the thick end downward through the horizontal band you created in Step #5. The thick end should be pulled all the way through – lying directly over the narrow end and covering it."));
            myList.add( new CustomTieNodeLoader(R.drawable.victoria8,"Snug the thick end into place. At this point, you have the finished shape of the knot. It should stand on its own even if you move your hands away."));

        }












        return  myList;
    }

    public List<CustomTieNodeLoader> loadCafeSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.cafe1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe11,""));

        return  myList;

    }

    public List loadEldredgeSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {

            myList.add( new CustomTieNodeLoader(R.drawable.eldredge1, "1. Comece com a extremidade larga da gravata à esquerda e a extremidade pequena à direita."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge2, "2. Pequena extremidade na extremidade larga para a esquerda."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge3, "3. Sob a grande extremidade e à direita. Até o centro, em direção ao pescoço"));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge4, "4. Através do laço do pescoço e à esquerda."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge5, "5. Através da frente, à direita. Em seguida, no alto do pescoço por baixo."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge6, "6. Para baixo para a esquerda e ao redor da parte de trás da extremidade larga para a direita. Mantenha esta parte solta."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge7, "7. Traga-o pela frente para a esquerda e através do loop feito no passo anterior."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge8, "8. Puxe a extremidade pequena para a esquerda para apertar."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge9, "9. Até o centro, em direção ao laço do pescoço. Atravessando o laço do pescoço e para a esquerda."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge10,"10. Até o centro, em direção ao laço do pescoço. Atravessando o laço do pescoço e à direita. Mantenha esta parte solta."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge11,"11. Através da frente para a esquerda e através do loop feito no passo anterior."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge12,"12. Puxe a extremidade pequena para a esquerda para apertar."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge13,"13. Tire o resto da pequena extremidade atrás do anel do pescoço no lado esquerdo."));

        } else {
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge1,"1. Start with the wide end of the tie on the left and the small end on the right. "));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge2,"2. Small end over the wide end to the left."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge3,"3. Under the wide end and to the right.  Up to the center, towards neck loop."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge4,"4. Through the neck loop and to the left."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge5,"5. Across the front, to the right. Then up into the neck loop from underneath."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge6,"6. Down to the left and around the back of the wide end to the right. Keep this part loose."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge7,"7. Bring it across the front towards the left and through the loop made in the previous step."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge8,"8. Pull the small end towards the left to tighten."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge9,"9. Up to the center, towards neck loop. Down through the neck loop and to the left."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge10,"10. Up to the center, towards neck loop. Down through the neck loop and to the right. Keep this part loose."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge11,"11. Across the front towards the left and through the loop made in the previous step."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge12,"12. Pull the small end towards the left to tighten."));
            myList.add( new CustomTieNodeLoader(R.drawable.eldredge13,"13. Tuck the rest of the small end behind neck loop on the left side."));
        }
        return  myList;
    }

    public List<CustomTieNodeLoader> loadTrinitySteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        if (lang.equals("pt")) {

            myList.add(new CustomTieNodeLoader(R.drawable.trinity1, "1. Comece com a extremidade larga da gravata à esquerda e a extremidade pequena à direita. A ponta da extremidade larga deve descansar na parte superior da fivela do cinto. Mova somente a parte ativa (pequena)"));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity2, "2. Na extremidade larga para a esquerda. Para cima no encaixe do pescoço por baixo."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity3, "3. Para baixo para a esquerda."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity4, "4. Ao redor da parte de trás da extremidade larga à direita."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity5, "5. Até o centro, em direção ao laço do pescoço."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity6, "6. Através do laço do pescoço e para a esquerda."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity7, "7. Através da extremidade larga para a direita. Subir no encaixe do pescoço por baixo."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity8, "8. Através do loop que você criou na etapa anterior. Mantenha-se solto."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity9, "9. Traga a extremidade pequena na parte de trás da extremidade larga para a direita."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity10,"10. Traga-o pela frente em direção ao centro e através do loop criado no passo anterior."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity11,"11. Aperte e coloque o resto da pequena extremidade atrás do anel do pescoço no lado esquerdo."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity12,"12. Hipnotizar a multidão de espectadores."));

        } else {

            myList.add(new CustomTieNodeLoader(R.drawable.trinity1, "1. Start with the wide end of the tie on the left and the small end on the right. The tip of the wide end should rest at the top of your belt buckle. Only move the active (small) end."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity2, "2. Over the wide end to the left. Up into the neck loop from underneath."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity3, "3. Down to the left."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity4, "4. Around the back of the wide end to the right."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity5, "5. Up to the center, towards neck loop."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity6, "6. Through the neck loop and down to the left."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity7, "7. Across the wide end to the right. Up into the neck loop from underneath."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity8, "8. Down through the loop you created in the previous step. Keep loose."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity9, "9. Bring the small end around the back of the wide end to the right."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity10, "10. Bring it across the front towards the center and through the loop created in the previous step."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity11, "11. Tighten and tuck the rest of the small end behind neck loop on the left side."));
            myList.add(new CustomTieNodeLoader(R.drawable.trinity12, "12. Hypnotize the throngs of onlookers."));
        }
        return  myList;
    }

    public List loadChristensenSteps(String lang) {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.christensen1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen11,""));
        return  myList;

    }
}

