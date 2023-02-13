import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public class MessageChannelTasklet implements Tasklet {

    @Autowired
    private MessageChannel channel;

    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        channel.send(MessageBuilder.withPayload("Hello World").build());
        return RepeatStatus.FINISHED;
    }
}
