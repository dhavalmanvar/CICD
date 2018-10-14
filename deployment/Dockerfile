FROM dhavalm/ubuorcjava:16.8_181

ENV APP_HOME /app/home

RUN mkdir -p $APP_HOME

COPY $TARGE_DIR/* $APP_HOME

WORKDIR $APP_HOME

EXPOSE 9090/tcp

RUN chmod +x $APP_HOME/app.sh

CMD ["bash","start_app.sh"]
