FROM node:17

WORKDIR /bycoders/web

ENV PATH /bycoders/web/node_modules/.bin:$PATH

COPY package.json /bycoders/web
COPY package-lock.json /bycoders/web
RUN npm install

COPY . /bycoders/web

EXPOSE 3000

ENTRYPOINT ["npm", "start"]