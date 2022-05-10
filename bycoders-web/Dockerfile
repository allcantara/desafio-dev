FROM node:16

WORKDIR /bycoders/web

COPY ./package.json /bycoders/web
COPY ./package-lock.json /bycoders/web
RUN npm install

COPY . /bycoders/web

EXPOSE 3000

ENTRYPOINT ["npm", "start"]